package race;

import entities.Document;
import entities.Runner;
import lombok.Data;
import strategies.registrations.IRegistration;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();

    //store a strategy for registration on the race
    private IRegistration registrationProcess;

    public Race(String name, LocalDate dayOfRace,
                IRegistration registrationProcess)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
        this.registrationProcess = registrationProcess;
    }

    public void register(Runner runner)
    {
        if (!runners.contains(runner))
        {
            runners.add(runner);
        }
    }

    public void raceDay()
    {
        //welcome everyone to the race
        System.out.println("Welcome to the " + name + " race!");
        System.out.println();

        //filter out those that can't run
        runners = registrationProcess.validate(runners);

        //run the race!
        System.out.println("Running today:");
        for (Runner runner : runners)
        {
            System.out.println(runner);
        }
        System.out.println();

        System.out.println("The winner was " + waitForWinner().getName());
    }

    public Runner waitForWinner()
    {
        Random random = new Random();
        int runnerNumber = random.nextInt(runners.size()) + 1;
        int count = 1;

        for (Runner runner : runners)
        {
            if (count == runnerNumber)
            {
                return runner;
            }
            count++;
        }

        throw new IllegalStateException("Runner not found");
    }
}


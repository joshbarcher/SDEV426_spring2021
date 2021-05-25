package driver;

import entities.Document;
import entities.Runner;
import race.Race;
import strategies.registrations.FallRegistrationStrategy;
import strategies.registrations.FreeForAllRegistrationStrategy;
import strategies.registrations.WinterRegistrationStrategy;

import java.time.LocalDate;
import java.util.Arrays;

public class TestClasses
{
    public static void main(String[] args)
    {
        Runner[] runners = {
            new Runner("Stan Williams",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Michelle Smith",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver"))),
            new Runner("Tyler Patrick",
                Arrays.asList(new Document("Winter Registration"),
                new Document("Liability Waiver"))),
            new Runner("Jean Davis",
                Arrays.asList(new Document("Winter Registration"),
                new Document("Liability Waiver"))),
            new Runner("Susie Brown",
                Arrays.asList(new Document("Fall Registration"))),
            new Runner("Terry Wilson",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver")))
        };

        //create the race and runners
        Race race = new Race("Fall Spectacle", LocalDate.of(2021, 9, 1),
                             new FallRegistrationStrategy());
        for (Runner runner : runners)
        {
            race.register(runner);
        }

        //start the race
        race.raceDay();
        System.out.println();

        Race race2 = new Race("Winter Wonderland", LocalDate.of(2021, 12, 1),
                new WinterRegistrationStrategy());
        for (Runner runner : runners)
        {
            race2.register(runner);
        }

        //start the race
        race2.raceDay();
        System.out.println();

        Race race3 = new Race("All Year, All Trouble", LocalDate.of(2021, 2, 1),
                new FreeForAllRegistrationStrategy());
        for (Runner runner : runners)
        {
            race3.register(runner);
        }

        //start the race
        race3.raceDay();
    }
}

package strategies.registrations;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class WinterRegistrationStrategy implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        Document requiredDoc1 = new Document("Winter Registration");
        Document requiredDoc2 = new Document("Liability Waiver");

        //using the stream API to filter out runners without the correct
        //documentation for the day, then assigning the stream back to
        //the set of runners
        return runners.stream()
                .filter(runner -> runner.getDocuments().contains(requiredDoc1) &&
                        runner.getDocuments().contains(requiredDoc2))
                .collect(Collectors.toSet());
    }
}

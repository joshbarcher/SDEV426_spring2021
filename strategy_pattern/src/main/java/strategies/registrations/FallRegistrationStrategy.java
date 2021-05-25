package strategies.registrations;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class FallRegistrationStrategy implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        Document requiredDoc = new Document("Fall Registration");

        //using the stream API to filter out runners without the correct
        //documentation for the day, then assigning the stream back to
        //the set of runners
        return runners.stream()
                .filter(runner -> runner.getDocuments().contains(requiredDoc))
                .collect(Collectors.toSet());
    }
}

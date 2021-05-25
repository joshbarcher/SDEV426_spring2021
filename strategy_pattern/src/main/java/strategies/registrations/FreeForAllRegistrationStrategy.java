package strategies.registrations;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class FreeForAllRegistrationStrategy implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        return runners;
    }
}

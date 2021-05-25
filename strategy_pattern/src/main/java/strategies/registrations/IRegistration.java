package strategies.registrations;

import entities.Runner;

import java.util.Set;

public interface IRegistration
{
    Set<Runner> validate(Set<Runner> runners);
}

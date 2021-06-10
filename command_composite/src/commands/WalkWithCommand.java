package commands;

import receivers.Umbrella;

public class WalkWithCommand implements IUmbrellaCommand
{
    private Umbrella receiver;
    private String destination;
    private boolean raining;

    //save old values before the command changes them
    private String oldDestination;
    private boolean oldRaining;

    public WalkWithCommand(Umbrella receiver, String destination, boolean raining)
    {
        this.receiver = receiver;
        this.destination = destination;
        this.raining = raining;
    }

    @Override
    public void doAction()
    {
        //changes the location of the umbrella
        oldDestination = receiver.getLocation();
        receiver.setLocation(destination);

        //is it raining?
        oldRaining = receiver.isWet();
        if (raining)
        {
            receiver.setWet(true);
        }

        System.out.println("You walked with the umbrella to " + destination +
                (raining ? " in the rain" : ""));
    }

    @Override
    public void undoAction()
    {
        System.out.println("Undoing walk with umbrella");
        receiver.setLocation(oldDestination);
        receiver.setWet(oldRaining);
    }
}

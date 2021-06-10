package commands;

import receivers.Umbrella;

public class ShakeCommand implements IUmbrellaCommand
{
    private Umbrella receiver;

    //save old values before the command changes them
    private boolean oldOpenState;
    private boolean oldRaining;

    public ShakeCommand(Umbrella receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void doAction()
    {
        //save the old values
        oldOpenState = receiver.isOpen();
        oldRaining = receiver.isWet();

        //opens and drys the umbrella
        receiver.setOpen(true);
        receiver.setWet(false);
        System.out.println("You shaked the umbrella");
    }

    @Override
    public void undoAction()
    {
        System.out.println("Undoing umbrella shake");
        receiver.setOpen(oldOpenState);
        receiver.setWet(oldRaining);
    }
}
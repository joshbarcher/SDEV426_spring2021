package commands;

import receivers.Umbrella;

public class ShakeCommand implements IUmbrellaCommand
{
    private Umbrella receiver;

    public ShakeCommand(Umbrella receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void doAction()
    {
        //opens and drys the umbrella
        receiver.setOpen(true);
        receiver.setWet(false);
        System.out.println("You shaked the umbrella");
    }

    @Override
    public void undoAction()
    {

    }
}
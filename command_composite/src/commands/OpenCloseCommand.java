package commands;

import receivers.Umbrella;

public class OpenCloseCommand implements IUmbrellaCommand
{
    private Umbrella receiver;
    private boolean openState;

    //this will hold the state of the umbrella before the change
    private boolean oldOpenState;

    public OpenCloseCommand(Umbrella receiver, boolean openState)
    {
        this.receiver = receiver;
        this.openState = openState;
    }

    @Override
    public void doAction()
    {
        //save the old state
        oldOpenState = receiver.isOpen();

        //open or close the umbrella
        receiver.setOpen(openState);
        System.out.println(openState ? "Umbrella opened" : "Umbrella closed");
    }

    @Override
    public void undoAction()
    {
        System.out.println("Undoing umbrella open/closed state");
        receiver.setOpen(oldOpenState);
    }
}

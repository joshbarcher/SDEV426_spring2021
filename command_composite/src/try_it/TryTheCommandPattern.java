package try_it;

import commands.IUmbrellaCommand;
import commands.OpenCloseCommand;
import commands.WalkWithCommand;
import receivers.Umbrella;

import java.util.Stack;

public class TryTheCommandPattern
{
    public static void main(String[] args)
    {
        Umbrella umbrella = new Umbrella("Nylon", false, false, "home");

        //create a few commands
        IUmbrellaCommand[] commands = {
            new OpenCloseCommand(umbrella, true),
            new WalkWithCommand(umbrella, "park", true),
            new WalkWithCommand(umbrella, "basketball court", false),
            new WalkWithCommand(umbrella, "home", false),
            new OpenCloseCommand(umbrella, false)
        };

        Stack<IUmbrellaCommand> undoStack = new Stack<>();

        //let's execute them
        for (IUmbrellaCommand command : commands)
        {
            command.doAction();
            undoStack.add(command);
        }

        //undo our changes
        while (!undoStack.isEmpty())
        {
            IUmbrellaCommand command = undoStack.pop();

            //remove the changes made by the command previously?
            command.undoAction();
        }

        System.out.println(umbrella);
    }
}

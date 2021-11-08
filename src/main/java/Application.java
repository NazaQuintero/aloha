import ar.com.nazaquintero.exceptions.UnrecognizedCommand;
import ar.com.nazaquintero.model.Command;
import ar.com.nazaquintero.model.CommandMultiton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException, UnrecognizedCommand {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CommandMultiton commandMultiton = CommandMultiton.getInstance();
        String text = reader.readLine();
        String[] commandArgs = text.split(" ");
        String commandName = commandArgs[0];
        String commandArg = "";

        if (commandArgs.length > 1)
            commandArg = commandArgs[1];

        Command command = commandMultiton.getInstanceOf(commandName);

        while(!command.shouldStopExecution()) {
            System.out.println(command.getName());
            command.execute(commandArg);

            text = reader.readLine();
            commandArgs = text.split(" ");
            commandName = commandArgs[0];

            commandArg = "";

            if (commandArgs.length > 1)
                commandArg = commandArgs[1];

            command = commandMultiton.getInstanceOf(commandName);
        }
    }
}

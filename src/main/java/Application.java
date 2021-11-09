import ar.com.nazaquintero.exceptions.UnrecognizedCommand;
import ar.com.nazaquintero.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException, UnrecognizedCommand {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Directory rootDirectory = new Directory(null, "root");

        CommandMultiton commandMultiton = CommandMultiton.getInstance();

        String text = reader.readLine();
        String[] commandArgs = text.split(" ");
        String commandName = commandArgs[0];
        String commandArg = "";

        if (commandArgs.length > 1)
            commandArg = commandArgs[1];

        try {
            Command command = commandMultiton.getInstanceOf(commandName);
            while(!command.shouldStopExecution()) {
                command.execute(commandArg, rootDirectory);

                text = reader.readLine();
                commandArgs = text.split(" ");
                commandName = commandArgs[0];

                commandArg = "";

                if (commandArgs.length > 1)
                    commandArg = commandArgs[1];

                command = commandMultiton.getInstanceOf(commandName);
            }
        } catch (UnrecognizedCommand e) {
            System.out.println(e);
        }

    }
}

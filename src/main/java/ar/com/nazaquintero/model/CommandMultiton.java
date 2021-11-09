package ar.com.nazaquintero.model;

import ar.com.nazaquintero.exceptions.UnrecognizedCommand;

import java.util.HashMap;

public class CommandMultiton {

    private static HashMap<String, Command> commandsAvailable = new HashMap<>();

    private static CommandMultiton commandMultiton = new CommandMultiton();


    private CommandMultiton() {
        commandsAvailable.put("quit", new Quit());
        commandsAvailable.put("pwd", new CurrentDirectory());
        commandsAvailable.put("ls", new ListContents());
        commandsAvailable.put("ls -r", new ListContentsRecursive(new CurrentDirectory(), new ListContents()));
        commandsAvailable.put("mkdir", new MakeDirectory());
        commandsAvailable.put("cd", new ChangeDirectory());
        commandsAvailable.put("touch", new CreateFile());
    }

    public static CommandMultiton getInstance() {
        return commandMultiton;
    }

    public Command getInstanceOf(String text) throws UnrecognizedCommand {
        if(commandsAvailable.get(text) == null) throw new UnrecognizedCommand();
        return commandsAvailable.get(text);
    }
}

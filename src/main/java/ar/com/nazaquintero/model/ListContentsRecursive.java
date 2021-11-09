package ar.com.nazaquintero.model;

import java.util.List;

public class ListContentsRecursive implements Command {
    private String name = "ls -r";
    private List<Command> commands;

    public ListContentsRecursive(Command... commands) {
        this.commands = List.of(commands);
    }

    @Override
    public boolean shouldStopExecution() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    // I should have tried a wombo combo with Iterator Pattern and Visitor ?
    // Iterator to traverse my Structure, and Visitor to separate algorithms from each Command ?

    @Override
    public void execute(String arg, Element root) {

    }
}

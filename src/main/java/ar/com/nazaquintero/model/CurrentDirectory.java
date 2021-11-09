package ar.com.nazaquintero.model;


import java.util.ArrayList;

public class CurrentDirectory implements Command {

    private String name = "pwd";

    @Override
    public boolean shouldStopExecution() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute(String arg, Element root) {
        ArrayList<String> stackDirectories = new ArrayList<>();
        root.getCurrentElement().printStackedDirectories(stackDirectories);
        System.out.println();
    }
}

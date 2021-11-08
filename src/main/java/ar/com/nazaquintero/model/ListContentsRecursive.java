package ar.com.nazaquintero.model;

public class ListContentsRecursive implements Command {
    private String name = "ls -r";

    @Override
    public boolean shouldStopExecution() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute(String arg) {

    }
}

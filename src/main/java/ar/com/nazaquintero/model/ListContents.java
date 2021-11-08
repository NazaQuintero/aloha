package ar.com.nazaquintero.model;

public class ListContents implements Command{

    private String name = "ls";

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

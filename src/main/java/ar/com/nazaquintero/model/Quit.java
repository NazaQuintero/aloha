package ar.com.nazaquintero.model;

public class Quit implements Command{
    private String name = "quit";

    @Override
    public boolean shouldStopExecution() {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute(String arg) {

    }
}

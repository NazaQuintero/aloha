package ar.com.nazaquintero.model;

public class CreateFile implements Command{

    private String name = "touch";

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

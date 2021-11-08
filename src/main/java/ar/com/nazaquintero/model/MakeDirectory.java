package ar.com.nazaquintero.model;

public class MakeDirectory implements Command{

    private String name = "mkdir";

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

package ar.com.nazaquintero.model;

public class ChangeDirectory implements Command{

    private String name = "cd";

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

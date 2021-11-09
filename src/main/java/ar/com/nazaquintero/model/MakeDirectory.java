package ar.com.nazaquintero.model;

public class MakeDirectory implements Command{

    private static final int MAX_CHAR_LIMIT = 100;

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
    public void execute(String directoryName, Element root) {
        if(directoryName.length() < MAX_CHAR_LIMIT) {
            root.getCurrentElement().addSubElement(new Directory(root.getCurrentElement(), directoryName));
        } else {
            System.out.println("Directory Name exceeded max limit of: " + MAX_CHAR_LIMIT + " characters");
        }
    }
}

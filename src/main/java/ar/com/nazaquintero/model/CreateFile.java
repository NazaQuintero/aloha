package ar.com.nazaquintero.model;

public class CreateFile implements Command{

    private static final int MAX_CHAR_LIMIT = 100;
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
    public void execute(String arg, Element root) {
        if(arg.length() < MAX_CHAR_LIMIT) {
            String[] args = arg.split(".");
            String fileName = "";
            String fileExtension = "";
            if(args.length > 1) {
                fileName = args[0];
                fileExtension = args[1];
            } else {
                fileName = arg;
            }
            root.getCurrentElement().addSubElement(new File(fileName, fileExtension));
        } else {
            System.out.println("File Name exceeded max limit of: " + MAX_CHAR_LIMIT + " characters");
        }

    }
}

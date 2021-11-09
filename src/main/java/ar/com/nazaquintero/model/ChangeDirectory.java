package ar.com.nazaquintero.model;

import java.util.HashMap;

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
    public void execute(String directoryName, Element root) {
        if(directoryName.equalsIgnoreCase("..")) {
            Element parentElement = root.getCurrentElement().getParentElement();
            root.setCurrentElement(parentElement);
        } else {
            Element candidateDirectory = root.getSubElements().get(directoryName);
            if(candidateDirectory == null) {
                System.out.println("Directory not found");
            } else {
                root.setCurrentElement(candidateDirectory);
            }
        }
    }
}

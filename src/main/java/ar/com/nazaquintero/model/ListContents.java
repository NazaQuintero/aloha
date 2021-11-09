package ar.com.nazaquintero.model;

import java.util.HashMap;

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
    public void execute(String arg, Element root) {
        HashMap<String, Element> subElements = root.getCurrentElement().getSubElements();
        subElements.entrySet().forEach(element -> System.out.println(element.getValue().toString()));
    }
}

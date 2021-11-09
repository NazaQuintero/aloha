package ar.com.nazaquintero.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Directory implements Element {

    private String name;
    private Element parentElement;
    private Element currentElement;

    private HashMap<String, Element> subElements = new HashMap<>();

    public Directory(Element parentElement, String name) {
        this.parentElement = parentElement;
        this.currentElement = this;
        this.setName(name);
    }

    public Element getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(Element currentDirectory) {
        this.currentElement = currentDirectory;
    }

    public void addSubElement(Element element) {
        if(subElements.get(element.getName()) != null) {
            System.out.println("Directory already exists");
        } else {
            subElements.put(element.getName(), element);
        }
    }

    public Element getParentElement() {
        return parentElement;
    }

    public void setParentElement(Directory parentElement) {
        this.parentElement = parentElement;
    }

    public HashMap<String, Element> getSubElements() {
        return subElements;
    }

    @Override
    public void printStackedDirectories(ArrayList<String> stackDirectories) {
        if(this.parentElement == null) {
            stackDirectories.add(this.toString());
            for (int i = stackDirectories.size() - 1; i >= 0; i--) {
                System.out.print(stackDirectories.get(i));
            }
        } else {
            stackDirectories.add(this.toString());
            this.parentElement.printStackedDirectories(stackDirectories);
        }
    }

    public void setSubElements(HashMap<String, Element> subElements) {
        this.subElements = subElements;
    }

    @Override
    public String toString() {
        return this.name + "/";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

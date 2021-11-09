package ar.com.nazaquintero.model;

import java.util.ArrayList;
import java.util.HashMap;

public class File implements Element {

    private String name;
    private String extension;

    public File(String name, String extension) {
        this.setName(name);
        this.setExtension(extension);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return this.getName() + "." + this.getExtension();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addSubElement(Element subElement) {

    }

    @Override
    public Element getCurrentElement() {
        return this;
    }

    @Override
    public Element getParentElement() {
        return null;
    }

    @Override
    public void setCurrentElement(Element element) {

    }

    @Override
    public HashMap<String, Element> getSubElements() {
        return null;
    }

    @Override
    public void printStackedDirectories(ArrayList<String> stackDirectories) {

    }
}

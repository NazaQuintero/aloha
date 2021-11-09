package ar.com.nazaquintero.model;

import java.util.ArrayList;
import java.util.HashMap;

public interface Element {
    String getName();
    String toString();
    void setName(String name);
    void addSubElement(Element subElement);
    Element getCurrentElement();
    Element getParentElement();
    void setCurrentElement(Element element);
    HashMap<String, Element> getSubElements();

    void printStackedDirectories(ArrayList<String> stackDirectories);
}

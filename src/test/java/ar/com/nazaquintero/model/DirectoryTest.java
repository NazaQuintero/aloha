package ar.com.nazaquintero.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {

    @Test
    @DisplayName("current element is Directory himself by default")
    void getCurrentElement() {
        //Arrange
        Directory directory = new Directory(null, "root");

        //Act
        Element currentElement = directory.getCurrentElement();

        //Assert
        assertEquals(directory, currentElement);
    }

    @Test
    @DisplayName("current element is Carlitos after have been set as current element")
    void getCurrentElementAfterHaveBeenSetCurrentElement() {
        //Arrange
        Directory directory = new Directory(null, "root");

        //Act
        Directory carlitos = new Directory(directory, "carlitos");
        directory.setCurrentElement(carlitos);
        Element currentElement = directory.getCurrentElement();

        //Assert
        assertEquals(carlitos, currentElement);
    }

}
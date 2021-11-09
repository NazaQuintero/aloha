package ar.com.nazaquintero.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeDirectoryTest {

    @Test
    @DisplayName("Should not stop execution")
    void shouldStopExecution() {
        //Arrange
        MakeDirectory mkdir = new MakeDirectory();

        //Act
        boolean shouldStopExecution = mkdir.shouldStopExecution();

        //Assert
        assertFalse(shouldStopExecution);
    }

    @Test
    void getName() {
        //Arrange
        MakeDirectory mkdir = new MakeDirectory();

        //Act
        String name = mkdir.getName();

        //Assert
        assertEquals("mkdir", name);
    }
}
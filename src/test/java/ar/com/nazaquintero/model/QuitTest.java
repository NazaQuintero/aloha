package ar.com.nazaquintero.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuitTest {

    @Test
    @DisplayName("Should stop execution")
    void shouldStopExecution() {
        //Arrange
        Quit quit = new Quit();

        //Act
        boolean shouldStopExecution = quit.shouldStopExecution();

        //Assert
        assertTrue(shouldStopExecution);
    }

    @Test
    @DisplayName("Should get quit when getName is called")
    void getName() {
        //Arrange
        Quit quit = new Quit();

        //Act
        String name = quit.getName();

        //Assert
        assertEquals("quit", name);
    }
}
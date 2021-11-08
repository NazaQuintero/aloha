package ar.com.nazaquintero.model;

public interface Command {

    boolean shouldStopExecution();
    String getName();
    void execute(String arg);
}

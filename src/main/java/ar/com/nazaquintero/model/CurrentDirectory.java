package ar.com.nazaquintero.model;

import java.util.List;

public class CurrentDirectory implements Command{

    private String name = "pwd";
    private List<String> fullPath = List.of("");

    @Override
    public boolean shouldStopExecution() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void execute(String arg) {
        for(String path: fullPath) System.out.print(path + "/");
        System.out.println();
    }
}

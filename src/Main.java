import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Planner planner = new Planner();
        planner.addTask();
        planner.addTask();
        planner.getTaskList();
        planner.writeToFile();

    }
}
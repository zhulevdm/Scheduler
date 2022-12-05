import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Planner implements ExportToCsv {
    private ArrayList<Record> taskList = new ArrayList<>();
    private String csv = "data.csv";


    @Override
    public void writeToFile() throws IOException {
        File file = new File(csv);
            FileWriter csvWriter = new FileWriter(csv);
            csvWriter.append("id,Дата создания,Описание задачи,Срок завершения,Приоритет\n");
            csvWriter.append(getTasks());
            csvWriter.flush();
            csvWriter.close();
    }
    public void addTask() {
        taskList.add(new Record(new Task(), addPriority()));
    }

    public Priority addPriority() {
        Priority priority = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите приоритет задачи:\n" +
                "1 - высокий\n" +
                "2 - обычный\n" +
                "3 - низкий");
        String pr = input.nextLine();

        while (!pr.equals("1") && !pr.equals("2") && !pr.equals("3")) {
            System.out.println("Введите 1, 2, или 3");
            pr = input.nextLine();
        }

        if (pr.equals("1")) {
            priority = Priority.high;
        } else if (pr.equals("2")) {
            priority = Priority.middle;
        } else if (pr.equals("3")) {
            priority = Priority.low;
        }
        return priority;
    }

    public String getTasks(){
        String tasks = "";
        for (Record record : taskList) {
            tasks += record.getId() +
                    "," + record.getTaskDateCreate() +
                    "," + record.getTaskDescription() +
                    "," + record.getTaskDeadline() +
                    "," + record.getTaskPriority() + "\n";

        }
        return tasks;
    }
    public void getTaskList() {
        System.out.println(getTasks());
    }

    public void setTaskList(ArrayList<Record> taskList) {
        this.taskList = taskList;
    }
}

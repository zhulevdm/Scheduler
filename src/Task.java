import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Calendar calendar = new GregorianCalendar();
    String dateCreate = dateFormat.format(calendar.getTime());
    private String deadline;
    private String description;
    public Task(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите описание задачи");
        this.description = input.nextLine();
        System.out.println(description);
        System.out.println("Введите срок завершения задачи в формате DD-MM-YYYY");
        this.deadline = input.nextLine();
        while (!deadline.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")){
            System.out.println("Введите правильно срок завершения: DD-MM-YYYY");
            deadline = input.nextLine();
        }
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription(){
        return description;
    }

}

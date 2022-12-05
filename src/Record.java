
public class Record {
    static int instansId = 0;
    private int id;
    private Task task;
    private Priority priority;
    public Record(Task task, Priority priority){
        this.task = task;
        this.priority = priority;
        instansId++;
        this.id = instansId;
    }

    public static int getInstansId() {
        return instansId;
    }

    public int getId() {
        return id;
    }

    public String getTaskDateCreate(){
        return task.getDateCreate();
    }

    public String getTaskDescription(){
        return task.getDescription();
    }

    public String getTaskDeadline() {
        return task.getDeadline();
    }

    public Priority getTaskPriority(){
        return priority;
    }
}

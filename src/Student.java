/**
 * Created by emma on 7/8/17.
 */
public class Student extends Person {

    private String status;

    public Student(String newStatus) {
        super();
        status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
}

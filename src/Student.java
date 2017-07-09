/**
 * Created by emma on 7/8/17.
 */
public class Student extends Person {

    private String status;

    public Student(String name, String address, String emailAddress, String phoneNumber, Date birthDate, String status) {
        super(name, address, emailAddress, phoneNumber, birthDate);
        status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
}

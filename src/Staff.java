/**
 * Created by emma on 7/9/17.
 */
public class Staff extends Employee {

    private String jobTitle;

    public Staff(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hireDate, String jobTitle) {
        super(name, address, emailAddress, phoneNumber, birthDate, salary, hireDate);

        setJobTitle(jobTitle);

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

/**
 * Created by emma on 7/9/17.
 */

/**
 * The Faculty class has String officeHours and String rank. It is a subclass of Employee
 * @author Emma Yang
 */

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hireDate, String officeHours, String rank) {
        super(name, address, emailAddress, phoneNumber, birthDate, salary, hireDate);

        setOfficeHours(officeHours);
        setRank(rank);

    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

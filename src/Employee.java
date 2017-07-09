/**
 * Created by emma on 7/8/17.
 */
public class Employee extends Person{

    double salary;
    Date hireDate;

    public Employee(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hireDate) {
        super(name, address, emailAddress, phoneNumber, birthDate);

        setSalary(salary);
        setHireDate(hireDate);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String toString() {

        return "Employee " + getName();

    }

}

/**
 * Created by emma on 7/8/17.
 */

/**
 * The Person class has a String name, String address, String emailAddress, String phoneNumber, and a Date birthDate.
 * It is the superclass of the Student and Employee classes
 * @author Emma Yang
 */

public class Person {

    String name;
    String address;
    String emailAddress;
    String phoneNumber;
    Date birthDate;

    public Person(String name, String address, String emailAddress, String phoneNumber, Date birthDate) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setEmailAddress(String newEmailAddress) {
        emailAddress = newEmailAddress;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public void setBirthDate(Date newDate) {
        birthDate = newDate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * The toString method overrides the regular toString method and displays the class name and the name of the person.
     * All subclasses of Person inherit this method
     * @return the class name and person name
     */

    public String toString() {

        return this.getClass() + " " + getName();

    }

}

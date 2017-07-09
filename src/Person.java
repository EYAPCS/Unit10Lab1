/**
 * Created by emma on 7/8/17.
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

    public String toString() {

        return "Person " + getName();

    }

}

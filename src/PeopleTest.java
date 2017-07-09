/**
 * Created by emma on 7/9/17.
 */
public class PeopleTest {

    public static void main(String[] args) {

        Person myPerson = new Person("Jeremy", "Down the Street", "helloworld@gmail.com", "123-456-1234", new Date(1,1,2001));
        Student myStudent = new Student("Alicia", "Under the Stairs", "goodbye@gmail.com", "456-789-4567",new Date(2,1,2000),"Freshman");
        Employee myEmployee = new Employee("Paul", "Iowa", "who@gmail.com", "789-456-1230", new Date(3,1,1990), 100.21, new Date(2,1,2005));
        Faculty myFaculty = new Faculty("John", "Florida", "asdf@gmail.com", "789-123-4356", new Date(2,12,1970), 456.42, new Date(3,1,2010), "3 - 5 PM", "Assistant");
        Staff myStaff = new Staff("Alexa", "Space", "qwerty@gmail.com", "678-234-5567", new Date(21,5,1990), 255.5, new Date(1,5,2015), "Secretary");

        System.out.println(myPerson.toString());
        System.out.println(myStudent.toString());
        System.out.println(myEmployee.toString());
        System.out.println(myFaculty.toString());
        System.out.println(myStaff.toString());


    }

}

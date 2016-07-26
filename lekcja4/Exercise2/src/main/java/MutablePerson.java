/**
 * Created by rb21776 on 2016-07-21.
 */
public class MutablePerson {

    private String firstName;
    private String lastName;
    private int age;

    public MutablePerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getName()+" {" +
                "imie='" + firstName + '\'' +
                ", nazwisko='" + lastName + '\'' +
                ", wiek=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

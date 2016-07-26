/**
 * Created by rb21776 on 2016-07-21.
 */
final public class ImmutablePerson {

   private final String firstName;
   private final String lastName;
   private final int age;


   public ImmutablePerson(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
   }

  public ImmutablePerson withFirstName(String firstName) {

     return new ImmutablePerson(firstName,this.lastName,this.age);
  }

  public ImmutablePerson withLastName(String lastName) {

     return new ImmutablePerson(this.firstName, lastName, this.age);
  }

  public ImmutablePerson withAge(int age) {

     return new ImmutablePerson(this.firstName, this.lastName, age);
  }

    @Override
    public String toString() {
        return getClass().getName()+" {" +
                "imie='" + firstName + '\'' +
                ", nazwisko='" + lastName + '\'' +
                ", wiek=" + age +
                '}';
    }
}

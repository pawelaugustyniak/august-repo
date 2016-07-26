/**
 * Created by rb21776 on 2016-07-25.
 */
public class Main {

    public static void main(String[] args) {

        MutablePerson zmiennyCzlowiek = new MutablePerson("ImieZmiennego", "NazwiskoZmiennego", 43);
        ImmutablePerson niezmiennyCzlowiek = new ImmutablePerson("ImieNIEZMIENNEGO", "NazwiskoNIEZMIENNEGO", 56);

        System.out.println("zmienny czlowiek "+ zmiennyCzlowiek.toString());
        System.out.println("NIEzmienny czlowiek "+ niezmiennyCzlowiek.toString());
        System.out.println(" ");
        System.out.println("zmiana zmiennego: ");
        zmiennyCzlowiek.setFirstName("JANEK");
        zmiennyCzlowiek.setAge(99);
        System.out.println("zmienny po zmianie: " + zmiennyCzlowiek);

        System.out.println("nowy NIEzmienny czlowiek: "+ niezmiennyCzlowiek.withFirstName("JOZUE"));

    }
}

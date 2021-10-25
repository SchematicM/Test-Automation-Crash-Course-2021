import com.sun.nio.sctp.PeerAddressChangeNotification;

public class main {
    public static void main(String[] args) {
        Person a1 = new Person();
        Person a2 = new Person("Marta", 2000);
        Person a3 = new Person("Volodya", 1998);
        Person a4 = new Person("Tanya", 2002);
        Person a5 = Person.input();

        System.out.println("Lets see all people!");
        Person[] people = new Person[]{a1, a2, a3, a4, a5};
        for (Person x : people)
        {
            x.output();
        }

    }
}

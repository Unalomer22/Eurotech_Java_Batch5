package Day50_Review;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Mehmet";
        p1.company = "Chip";

        p1.printCompany();

        Person p2 = new Person();
        p2.name = "Ayse";
        p2.company = "Chip";

        p2.printCompany();

        p2.company = "Pollinate";

        p1.printCompany();
        p2.printCompany();

    }
}

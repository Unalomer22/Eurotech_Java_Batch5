package Day44_Encapsulation;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();
        //person.name = "Mehmet";
        // person.age = 40;

        person.setName("Mehmet");
        person.setAge(40);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.print();

        Person person2 = new Person();
        //person2.name = "@£@%£Ayse@£%@%";
        // person2.age = -30;

        //No condition nonsense
        person2.setName("@£@%£Ayse@£%@%");
        person2.setAge(-30);

        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        person2.print();

    }
}

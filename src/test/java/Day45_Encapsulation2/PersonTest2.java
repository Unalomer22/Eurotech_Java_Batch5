package Day45_Encapsulation2;

public class PersonTest2 {

    public static void main(String[] args) {

        //Person2 person = new Person2();
        //person.name = "Isim";

        Person2 person = new Person2("Isim", 40, 'M');
        person.setName("Isim");
        System.out.println(person.getName());

        //person.name = "Ali";
        person.gender = 'F';
        person.setAge(50);

        System.out.println("Name : " + person.getName() + " Age : " + person.getAge() + " Gender : " + person.getGender());

    }
}

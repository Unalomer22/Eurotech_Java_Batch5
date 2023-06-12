package Day25_Object_Class;

public class DogObject {

    public static void main(String[] args) {

        //  ClassName       objectName          new Keyword       ClassName/Constructor
             Dog               dog1      =         new                 Dog();

        Dog dog2 = new Dog();

        Dog dog3 = new Dog();

        // "." operatorunu kullanarak field ya da method lara ulasabiliyoruz
        dog1.ad = "Artis";
        dog1.cins = "Tarrier";
        dog1.renk = "Siyah";
        dog1.yas = 5;

        System.out.println(dog1.ad);
        System.out.println(dog1.cins);
        System.out.println(dog1.renk);
        System.out.println(dog1.yas);

        dog1.havlama();
        dog1.isirma();
        dog1.yemekYeme();
        dog1.uyuma();

        // Object uzerinden ulasilan field a yeni deger assign etmek mumkun
        dog1.cins = "Bulldog";
        System.out.println(dog1.cins);

        // Ya da object uzerinden defalarca ayni eylemi yaptirmak mumkun
        dog1.havlama();
        dog1.havlama();
        dog1.havlama();

        System.out.println(dog2.ad);

    }
}

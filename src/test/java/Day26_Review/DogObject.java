package Day26_Review;

public class DogObject {

    public static void main(String[] args) {

        //  ClassName       objectName          new Keyword       ClassName/Constructor
              Dog2             dog1         =         new                Dog2();

        Dog2 dog2 = new Dog2();

        Dog2 dog3 = new Dog2();

        System.out.println("dog1 = " + dog1);
        System.out.println("dog3 = " + dog3);

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

        // Default Values For Instance Variable
        // String instance variable a deger assign etmedigimiz takdirde default "null"
        System.out.println(dog2.ad);

        // int instance variable a deger assign etmedigimiz takdirde default "0"
        System.out.println(dog2.yas);

        // boolean instance variable a deger assign etmedigimiz takdirde default "false"
        System.out.println(dog2.evcil);

        // char instance variable a deger assign etmedigimiz takdirde default " " || '/u0000'
        System.out.println(dog2.cinsiyet);

    }
}

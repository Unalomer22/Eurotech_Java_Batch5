package Day58_Review;

public class TestParentChild {

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("Arttirmadan once deger : " + child.num);

        child.increment();

        System.out.println("Arttirmadan sonra deger : " + child.num);

        //////////////
        Parent parent = new Parent();

        System.out.println("Arttirmadan once deger : " + parent.num);

        parent.increment();

        System.out.println("Arttirmadan sonra deger : " + parent.num);



    }
}

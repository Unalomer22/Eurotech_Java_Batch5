package Day59_Polymorphism;

public class Parent {

    public void Print(){
        System.out.println("Parent Class");
    }
}

class SubClass1 extends Parent{

    public void Print(){
        System.out.println("SubClass1 Class");
    }
}

class SubClass2 extends Parent {

    public void Print() {
        System.out.println("SubClass2 Class");
    }
}

class RunTimePolyTest{

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.Print();

        SubClass1 subClass1 = new SubClass1();
        subClass1.Print();

        SubClass2 subClass2 = new SubClass2();
        subClass2.Print();

    }

}


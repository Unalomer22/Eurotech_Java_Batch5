package Day59_Polymorphism;

public interface MyInterface {

    void show();
}

class ClassA implements MyInterface{

    public void show(){
        System.out.println("ClassA shows");
    }
}

class ClassB implements MyInterface{

    public void show(){
        System.out.println("ClassB shows");
    }
}

class PolymorhismExample2{

    public static void main(String[] args) {

        //Non-Polymorpic way
        ClassA classA = new ClassA();
        classA.show();
        ClassB classB = new ClassB();
        classB.show();

        //Polymorpic way
        MyInterface classA1 = new ClassA();
        classA1.show();
        MyInterface classB1 = new ClassB();
        classB1.show();

    }
}

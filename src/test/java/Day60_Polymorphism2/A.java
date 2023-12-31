package Day60_Polymorphism2;

public class A {
    public void methodA(){}
}

class B extends A{
    public void methodB(){}
}

class C extends B{
    public void methodC(){}
}

class Test{

    public static void main(String[] args) {

     A obj = new B();
     obj.methodA();

     B obj2 = (B) obj; // B obj2 = new B();
     obj2.methodB();

     A obj3 = new C();
     obj3.methodA();

     B obj4 = (B) obj3;
     obj4.methodB();
     obj4.methodA();

     C obj5 = (C) obj4;
     obj5.methodC();
     obj5.methodB();
     obj5.methodA();

     /////////////////
     // Can not be casted below class level
     A obj6 = new B();
     C obj7 = (C) obj6;
     obj7.methodC();
     obj7.methodB();
     obj7.methodA();

     /*
     A
     B
     C
     D

     A obj = new D();
     Casting level : B,C,D

     A obj2 = new C();
     Casting level : B,C
     Not casting to D
      */

    }
}

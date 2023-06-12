package Day52_AccessModifiers2;

import Day52_AccessModifiers.A1;

public class A5 {

    public static void main(String[] args) {

        A1 obj = new A1(); // Need to import class first if we want to create an object from a calss in another package
        //obj.i; // Can not access private instance and method
        //obj.test(); // Can not access private instance and method

        //A3 obj2 = new A3(); // Can not create an object due to constructor being private
    }

}

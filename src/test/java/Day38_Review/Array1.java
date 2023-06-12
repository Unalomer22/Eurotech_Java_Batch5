package Day38_Review;

public class Array1 {

    public static void main(String[] args) {

        /*
        Write a method that accepts an array and return true if 6 appears as either the first or
        last element in the array. The array will be length 1 or more.

        int[] x = {1,2,6}; = > true
        int[] y = {6,1,2,3}; = > true
        int[] z = {13,6,1,2,3}; = > false
         */

        int[] x = {1,2,6};
        boolean b = firstLast6(x);
        System.out.println("b = " + b);

        int[] y = {6,1,2,3};
        boolean b2 = firstLast6(y);
        //System.out.println(firstLast6(y));
        System.out.println("b2 = " + b2);

        int[] z = {13,6,1,2,3};
        boolean b3 = firstLast6(z);
        System.out.println("b3 = " + b3);

    }

    public static boolean firstLast6(int[] array){
        if(array.length<1){
            return false;
        }

        if(array[0]==6 || array[array.length-1]==6){
            return true;
        }else{
            return false;
        }
    }

}

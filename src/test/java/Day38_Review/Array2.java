package Day38_Review;

public class Array2 {

    public static void main(String[] args) {

        /*
        Write a method that accepts an array and check the length of the array first.
        If the length is more than one, check if the first element and last element are equal.
        if it is print true, if not print false.
        If the length is not more than 1, print not valid an array

        int[] x = {1,2,3}; = > false
        int[] y = {1,2,3,1}; = > true
        int[] z = {1,2,1}; = > true
        int[] k = {1}; = > not a valid array
         */

        int[] x = {1,2,3};
        System.out.println(firstLastEqual(x));

        int[] y = {1,2,3,1};
        String result = firstLastEqual(y);
        System.out.println(result);

        int[] z = {1,2,1};
        System.out.println(firstLastEqual(z));
        Boolean b1 = new Boolean(firstLastEqual(z));
        System.out.println("b1 = " + b1);

        int[] k = {1};
        System.out.println(firstLastEqual(k));
    }

    public static String firstLastEqual(int[] arr){

        if(!(arr.length>1)){
            return "not valid an array";
        }

        if(arr[0] == arr[arr.length-1]){
            return "true";
        }else{
            return "false";
        }
    }
}

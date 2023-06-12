package Day18_Review;

public class SumOfNumbers {

    public static void main(String[] args) {

        // Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100

        int sumOfEven=0;
        int sumOfOdd=0;

        for(int i=1; i<100; i++){

            if(i%2==0){
               sumOfEven += i; // sumOfEven = sumOfEven + i
            }else{
                sumOfOdd += i;
            }
        }

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

    }
}

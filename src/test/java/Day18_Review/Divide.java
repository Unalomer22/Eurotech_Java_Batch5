package Day18_Review;

public class Divide {

    public static void main(String[] args) {

        // Write a program that checks if number is dividable to 2,3,6

        int number = 60;

        if(number%2==0){
            //System.out.println("Number can be dived 2");
            if(number%3==0){
                System.out.println("Number can be divided 2,3,6");
            }else{
                System.out.println("Number can not be divided 3 and 6");
            }
        }else{
            System.out.println("Number can not be divided 2");
        }

        System.out.println("////////////////");

        if(number%2==0 && number%3==0){
            System.out.println("Number can be divided 2,3,6");
        }

        System.out.println("////////////////");

        System.out.println("Number can be divided 2,3,6 " + (number%2==0 && number%3==0));

        System.out.println("////////////////");

        System.out.println("Number can be divided 2,3,6 " + (number%6==0));
    }
}

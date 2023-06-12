package Day15_TernaryOperator;

public class IfElseToTernary {

    public static void main(String[] args) {

        int number = 24;

        //If Else
        if(number>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }

        //Ternary
        String str = (number>0) ? "Positive Number" : "Negative Number";
        System.out.println(str);

        System.out.println("////////////////////");

        int score = 65;

        String result = (score>60) ? "You passed the exam" : "You failed the exam";

        System.out.println(result);

        System.out.println("////////////////////");

        int age = (int) 18;

        String isEligible = (age >= 18) ? "User is eligible to vote" : "User is not eligible to vote";

        System.out.println(isEligible);

    }
}

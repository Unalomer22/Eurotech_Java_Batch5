package Day12_SelectionStatements;

public class IfExercise3 {

    public static void main(String[] args) {

        int num1 = 120;
        int num2 = 80;
        int num3 = 40;

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the max number");
        }

        if(num2>num1 && num2>num3){
            System.out.println(num2 + " is the max number");
        }

        if(num3>num1 && num3>num2){
            System.out.println(num3 + " is the max number");
        }
    }
}

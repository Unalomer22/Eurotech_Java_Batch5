package Day15_TernaryOperator;

public class NestedTernary {

    public static void main(String[] args) {

        int x = 6;

        if(x>2){
            if(x<5){
                System.out.println(10);
            }else{
                System.out.println(7);
            }
        }else{
            System.out.println(5);
        }

        //Ternary 
        int number = x>2?x<5?10:7:5;
        System.out.println(number);
        
        ////////////////

        //Ternary
        int n1 = 10;
        int n2 = 5;

        int larger = (n1 > n2) ? n1 : n2;
        System.out.println("larger = " + larger);

        //Nested Ternary
        int num1 = 50;
        int num2 = 40;
        int num3 = 30;

        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("largest = " + largest);
    }
}

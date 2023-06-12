package Task;

import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {

        // ORIGINAL = 3,6,7,8,9,12,15,17,359
        List<Integer> original = Arrays.asList(3,6,7,8,9,12,15,17,359);

        /*
        Task 1
        Implement a solution to square each integer in the collection named ORIGINAL
        and output to the console a comma separated list of the processed values
        Expected output : 9,36,49,64,81,144,225,289,128881
         */

        for(int i=0; i<original.size(); i++){
            if(i != original.size()-1) {
                System.out.print(original.get(i) * original.get(i) + ",");
            }
            else {
                System.out.print(original.get(i) * original.get(i));
            }
        }


        System.out.println("");

        /*
        Task 2
        Implement a solution to obtain only the numbers in the collection named ORIGINAL that are divisible by 3
        and output to the console a comma separated list of the values
        Expected output : 3,6,9,12,15
         */

        boolean flag = false;

        for(int i=0; i<original.size(); i++) {
            if (original.get(i) % 3 != 0) {
                continue;
            }
            if (flag) {
                System.out.print(",");
            }
            if (original.get(i) % 3 == 0) {
                System.out.print(original.get(i));
                flag = true;
            }
        }


        System.out.println("");

        /*
        Task 3
        Implement a solution to sum the adjacent integers in the collection named ORIGINAL
        and output to the console a comma separated list of the values
        Expected output : 9,16,21,24,29,36,44,391
         */

        boolean flag2 = false;

        for(int i=0; i<original.size(); i++){
            if(i==original.size()-1){
                break;
            }
            if(flag2){
                System.out.print(",");
            }
            if(i==0){
                System.out.print(original.get(i) + original.get(i+1));
            }
            else{
                System.out.print(original.get(i-1) + original.get(i) + original.get(i+1));
            }
            flag2 =true;
        }
    }
}

package Task;

public class Task2 {

    public static void main(String[] args) {

        long w = repeatedString("a", 10000000000L);
        System.out.println("w = " + w);
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
            int counter = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'a'){
                    counter++;
                }
            }

            int counter2 = 0;
            for(int i=0; i<n%s.length(); i++) {
                if (s.charAt(i) == 'a') {
                counter2++;
                }
            }
            return counter * (n/s.length()) + counter2;
        }
}

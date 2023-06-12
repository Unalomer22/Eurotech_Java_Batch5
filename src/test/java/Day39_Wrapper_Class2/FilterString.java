package Day39_Wrapper_Class2;

public class FilterString {

    public static void main(String[] args) {

        // Write a method that filters a string and finds the letter to have a meaningful statement
        String str = "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";

        System.out.println(filterString(str));

    }

    public static String filterString(String str){

        String newStr = "";

        for(int i=0; i<str.length(); i++){

            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' '){
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }
}

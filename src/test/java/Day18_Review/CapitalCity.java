package Day18_Review;

public class CapitalCity {

    public static void main(String[] args) {

        String capital = "London";
        String country = "";

        switch(capital){

            case "London":
                country = "England";
                break;
            case "Paris":
                country = "France";
                break;
            case "Berlin":
                country = "Germany";
                break;
            case "Ankara":
                country = "Turkey";
                break;
            default:
                country = "Unknown";
        }

        System.out.println(capital + " is capital of " + country);

    }
}

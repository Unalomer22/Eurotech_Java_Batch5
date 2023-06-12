package Day7_Review;

public class FamilyTask {

    public static void main(String[] args) {

        /*
        Store the followings into appropriate variables: number of children, partner’s name, geaographic location, job title.
        Print in concole in following structure;
        “I am father/mother of X and married to Y, working as Z in V"
         */

        int numberOfChildren = 2;
        String partnerName = "Ayse";
        String location = "Germany";
        String jobTitle = "QA Engieer";

        String text = "I am father of " + numberOfChildren + " and married to " + partnerName + ", working as " + jobTitle + " in " + location;

        System.out.println(text);
    }
}

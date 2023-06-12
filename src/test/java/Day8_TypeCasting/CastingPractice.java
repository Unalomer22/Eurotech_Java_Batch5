package Day8_TypeCasting;

public class CastingPractice {

    public static void main(String[] args) {

        int pies = 10, people =4;
        double piesPerson;

        piesPerson = pies / people;
        System.out.println("piesPerson = " + piesPerson);

        piesPerson = (double)pies / people;
        System.out.println("piesPerson = " + piesPerson);

        piesPerson = pies / (double)people;
        System.out.println("piesPerson = " + piesPerson);

        piesPerson = (double)(pies / people);
        System.out.println("piesPerson = " + piesPerson);
        
    }
}

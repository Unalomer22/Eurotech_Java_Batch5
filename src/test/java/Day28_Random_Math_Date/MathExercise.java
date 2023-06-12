package Day28_Random_Math_Date;

public class MathExercise {

    public static void main(String[] args) {

        // Math math = new Math(); // Constructor private oldugu icin object create etmeye izin vermiyor

        double pi = Math.PI;
        System.out.println("pi = " + pi);

        double pow = Math.pow(3.0,3.0);
        System.out.println("pow = " + pow);

        int pow2 = (int)Math.pow(3.0,3.0);
        System.out.println("pow2 = " + pow2);

        double sqrt = Math.sqrt(9.0);
        System.out.println("sqrt = " + sqrt);

        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.4));

        System.out.println(Math.floor(5.9));

        System.out.println(Math.ceil(5.1));

    }
}

package Day15_TernaryOperator;

public class TernaryOperator {

    public static void main(String[] args) {

        int x,y,z;

        x = 20;

        // condition false dondugu icin y dediskenine 75 assign edildi
        y = (x == 5) ? 50 : 75;
        System.out.println("y = " + y);

        // condition true dondugu icin z degiskenine 50 assign edildi
        z = (x == 20) ? 50 : 75;
        System.out.println("z = " + z);

    }
}

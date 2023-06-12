package Day15_TernaryOperator;

public class NestedTernary2{

    public static void main(String[] args) {

        int not = 45;

        String puan = (not >= 90) ? "Puaniniz A" :
                            (not >= 80 ) ? "Puaniniz B" :
                                 (not >= 70 ) ? "Puaniniz C" :
                                         (not >= 60 ) ? "Puaniniz D" :
                                                 (not >= 50 ) ? "Puaniniz E" :
                                                    "Kaldiniz";

        System.out.println("puan = " + puan);
    }
}

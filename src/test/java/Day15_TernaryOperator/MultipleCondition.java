package Day15_TernaryOperator;

public class MultipleCondition {

    public static void main(String[] args) {
        
        String name = "Ahmet Yilmaz";
        int yas = 27;
        
        String kayitSonucu = (name == "Ahmet Yilmaz" && yas == 27) ? "kayit kabul" : "kayit kabul degil";

        System.out.println("kayitSonucu = " + kayitSonucu);
    }
}

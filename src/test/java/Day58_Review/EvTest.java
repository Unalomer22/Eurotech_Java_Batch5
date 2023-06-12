package Day58_Review;

public class EvTest {

    public static void main(String[] args) {

        Oda oda1 = new Oda("Oturma","Sari");
        Oda oda2 = new Oda("Misafir", "Kirmizi");
        Oda oda3 = new Oda("Cocuk", "Mor");
        //Oda oda4 = new Oda("Salon", "Mavi");
        Cati cati = new Cati(10.5,"Kahverengi");
        Mutfak mutfak = new Mutfak("Amerikan",20,"MDF","Fayans");
        Bahce bahce = new Bahce("Cim", "Demir", "Elektricli", true);

        Ev ev = new Ev("BahceliEv",oda1,oda2,oda3,new Oda("Salon", "Mavi"),cati,mutfak,bahce);

        ev.kapiAc();
        ev.getCati().tut();
        ev.getMutfak().yemekYap();
        ev.getBahce().sula();
        System.out.println(ev.getOda1().getNeOdasi());
        System.out.println("Havuz carmi? " + ev.getBahce().isHavuzVarmi());

    }
}

package Day26_Review;

public class PhoneShop {

    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone();

        phone1.marka = "IPhone";
        phone1.model = "X";
        phone1.renk = "Gri";
        phone1.ekranBoyutu = 8.5;
        phone1.fiyat = 1250;

        System.out.println("---------Urun Bilgileri-------");
        System.out.println("Ceptelefon Markasi " + phone1.marka);
        System.out.println("Ceptelefon Modeli " + phone1.model);
        System.out.println("Ceptelefon rengi " + phone1.renk);
        System.out.println("Ceptelefon ekran boyutu " + phone1.ekranBoyutu + " inch");
        System.out.println("Ceptelefon fiyati " + phone1.fiyat + "$");

        phone1.arama();
        phone1.mesajAtma();
        phone1.fotografCekme();
        phone1.navigasyonaBaglanma();
    }
}

package Day50_Review;

public class Party {

    public static void main(String[] args) {

        Aile baba = new Aile();
        Aile anne = new Aile();
        Aile cocuk = new Aile();

        System.out.println(Aile.pastaDilimi);

        baba.pastaYe();
        System.out.println(Aile.pastaDilimi);

        baba.pastaYe();
        System.out.println(Aile.pastaDilimi);

        anne.pastaYe();
        System.out.println(Aile.pastaDilimi);

        cocuk.pastaYe();
        System.out.println(Aile.pastaDilimi);

        baba.pastaYe(4);
        System.out.println(Aile.pastaDilimi);

    }
}

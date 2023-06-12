package Day58_Review;

public class Cati {

    private double yukseklik;
    private String renk;

    public void tut(){
        System.out.println("Baca tutuyor....");
    }

    public Cati(double yukseklik, String renk) {
        this.yukseklik = yukseklik;
        this.renk = renk;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public String getRenk() {
        return renk;
    }
}

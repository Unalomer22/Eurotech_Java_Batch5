package Day60_Polymorphism2;

public class InstanceOf {

    public static void main(String[] args) {

        Sekil sekil = new Ucgen();

        if(sekil instanceof Daire){
            System.out.println("Daire");
        }else if(sekil instanceof Kare){
            System.out.println("Kare");
        }else if(sekil instanceof Ucgen){
            System.out.println("Ucgen");
        }
    }
}

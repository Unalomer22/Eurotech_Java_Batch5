package Day55_Composition;

public class Test {

    public static void main(String[] args) {

        Child child = new Child();
        child.print(); // Ayni intance child class ta yok iken inheritance iliskisi uzerinden parent class daki instance a ulasiliyor
                        // Eger ayni isimde instance child class ta olusturulursa parent class instance hide ediliyor ve child class takine ulasiliyor

        child.printParent(); // Eger bu durumda consepti degistirmeden (classlar arasindaki iliski ve accessibility) + (parent class daki instance hide edildigi halde)
                                // parent class daki instance a ulasilmak isteniyorsa super key word u ile hafizadaki ikinci instance a ulasilabilir

    }
}

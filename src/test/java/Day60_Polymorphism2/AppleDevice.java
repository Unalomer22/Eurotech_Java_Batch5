package Day60_Polymorphism2;

public class AppleDevice {

    public void use(){
        System.out.println("APPPLEDEVICE | RUN");
    }
}

class Mac extends AppleDevice{

    public void use(){
        System.out.println("MAC | RUN");
    }

    public void code(){
        System.out.println("Mac is coding....");
    }
}

class Ipad extends AppleDevice{

    public void use(){
        System.out.println("IPAD | RUN");
    }

    public void draw(){
        System.out.println("Drawing on Ipad.....");
    }
}

class AppleWatch extends AppleDevice{

    public void use(){
        System.out.println("APPLEWATCH | RUN");
    }

    public void wear(){
        System.out.println("wearing AppleWatch");
    }
}

class AppleStore{

    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
        //mac.code();

        Mac mac1 = new Mac();
        mac1.use();
        mac1.code();

        AppleDevice watch = new AppleWatch();
        watch.use();
        //watch.wear();

    }

}

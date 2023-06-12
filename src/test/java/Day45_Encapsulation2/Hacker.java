package Day45_Encapsulation2;

public class Hacker {

    public static void main(String[] args) {

        VictimBank hacker = new VictimBank();

        // 1. Seneryo / Hacker hesaptan para calmak istiyor
        //hacker.acc_balance = -1000;
        System.out.println("Account Number : " + hacker.printAccountNumber() + " Account Balance : " + hacker.printAccountBalance());


        // 2. senaryo / Hacker setter methodu ile de hesaba mudahale edebilir
        hacker.depositMoney(-1000);

        System.out.println("Account Number : " + hacker.printAccountNumber() + " Account Balance : " + hacker.printAccountBalance());

    }
}

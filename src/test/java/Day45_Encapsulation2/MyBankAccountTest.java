package Day45_Encapsulation2;

public class MyBankAccountTest {

    public static void main(String[] args) {

        MyBankAccount myBankAccount = new MyBankAccount(12345678, 0);

        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());

        //myBankAccount.acc_balance = 5000;
        myBankAccount.depositMoney(5000);

        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());

        myBankAccount.depositMoney(10000);

        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());

    }
}

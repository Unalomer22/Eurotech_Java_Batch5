package Day45_Encapsulation2;

public class VictimBank {

    /*
    int acc_number;
    int acc_balance;
*/
    //1. Cozum // degiskenleri private yaparak disaridan ulasima kapatmak
    private int acc_number;
    private int acc_balance;

    public int printAccountNumber(){
        return this.acc_number;
    }

    public int printAccountBalance(){
        return this.acc_balance;
    }

    // 2. Cozum setter methodunun icerisine kosul koyarak para cikisini onlemek
    public void depositMoney(int money){
        if(money > 0){
            this.acc_balance += money;
        }
    }
}

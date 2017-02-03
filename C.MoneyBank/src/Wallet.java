/**
 * Created by Ana Lourenço on 04/10/16.
 */

public class Wallet {

    private int currentAmount;



    public Wallet(int currentAmount) {   // EL CONSTRUCTOR!!
        this.currentAmount = currentAmount;
    }



    public int addMoney(int amount) {
        this.currentAmount = currentAmount + amount;
        return this.currentAmount;
    }

    public int removeMoney(int amount) {
        if (amount <= this.currentAmount) {
            this.currentAmount = currentAmount - amount;
        }
        return this.currentAmount;
    }

    public int getCurrentAmount() {
        return this.currentAmount;
    }

    @Override
    public String toString() {
        return "current Amount -> " + currentAmount;
    }
}

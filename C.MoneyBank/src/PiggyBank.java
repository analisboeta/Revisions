/**
 * Created by Ana Lourenço on 04/10/16.
 */
public class PiggyBank {

    private int totalSavedAmount;



    public PiggyBank(int totalSavedAmount) {   // EL CONSTRUCTOR!!
        this.totalSavedAmount = totalSavedAmount;
    }



    public int addSavings(int amount) {
        this.totalSavedAmount = totalSavedAmount + amount;
        return this.totalSavedAmount;
    }

    public int removeSavings(int amount) {
        if (amount <= this.totalSavedAmount) {
            this.totalSavedAmount = totalSavedAmount - amount;
        }
        return amount;
    }

    public int getTotalSavedAmount() {
        return this.totalSavedAmount;
    }

    @Override
    public String toString() {
        return "totalSavedAmount -> " + totalSavedAmount;
    }
}

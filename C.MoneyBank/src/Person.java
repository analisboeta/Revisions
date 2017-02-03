/**
 * Created by Ana Lourenço on 04/10/16.
 */
public class Person {

    private String name;
    private Wallet wallet;
    private PiggyBank piggyBank;


    public Person(String name, int walletAmount, int piggyBankAmount) {
        this.name = name;
        wallet = new Wallet(walletAmount);
        piggyBank = new PiggyBank(piggyBankAmount);
    }


    public void save(int amountSaved) {

        if (wallet.getCurrentAmount() == 0) {
            System.out.println(this.name + "there's not enough money for you to save something. nothing. zilch. Nada.");
        } else if (amountSaved > wallet.getCurrentAmount()) {
            System.out.println(this.name + ", learn to count first, " +
                    "Then count how much money you have on your wallet," +
                    " and THEN think about saving some. Jeez.\n");
        } else if (amountSaved == wallet.getCurrentAmount()) {
            wallet.removeMoney(amountSaved);
            piggyBank.addSavings(amountSaved);
            System.out.println("You'll end up with nothing! Still, " + this.name +
                    " has just put " + amountSaved + " into a piggy bank!");
        } else {
            wallet.removeMoney(amountSaved);
            piggyBank.addSavings(amountSaved);
            System.out.println(this.name + " has just put " + amountSaved + " into a piggy bank!");
        }
    }

    public void spend(int amountSpent) {

        if (wallet.getCurrentAmount() == 0) {
            System.out.println(this.name + " there's not enough money for you to spend. You should withdraw something from your piggybank!");
        } else if (wallet.getCurrentAmount() < amountSpent) {
            System.out.println(this.name + "... I know you want to spend " + amountSpent +
                    " euros, but check your wallet first, you don't have that money!");
        } else {
            wallet.removeMoney(amountSpent);
            System.out.println(this.name + " has just spent " + amountSpent + " euros!");
        }
    }

    public void withdraw(int amountWithdrawn) {

        if (piggyBank.getTotalSavedAmount() == 0) {
            System.out.println(this.name + ", computer says no.");
        } else if (piggyBank.getTotalSavedAmount() < amountWithdrawn) {
            // Dedicating Shirley Bassey's Big Spender for those who dont know how to save money!
            System.out.println("*Cue the music! " + this.name + ", this one's for you!* \n " +
                    "\t\tA real Big Spender,\n" +
                    "\t\tGood looking, so refined.\n" +
                    "\t\tSay, wouldn't you like to know what's going on in my mind?\n" +
                    "\t\tSo let me get right to the point,\n" +
                    "\t\tI don't pop my cork for every man I see.\n" +
                    "\t\tHey! Big Spender,\n" +
                    "\t\tHey! Big Spender,\n" +
                    "\t\tSpend a little time with me\n" +
                    "don't try to withdraw more than you have saved!!");
        } else {
            int money = piggyBank.removeSavings(amountWithdrawn);
            wallet.addMoney(money);
            System.out.println(this.name + " has withdrawn " + amountWithdrawn + " from the piggybank!");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", piggyBank=" + piggyBank +
                '}';
    }
}
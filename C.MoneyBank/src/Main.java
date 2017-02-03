/**
 * Created by codecadet on 04/10/16.
 */
public class Main {

    public static void main(String[] args) {

        /// Created two instances o with different characteristics
        Person ana = new Person("Ana", 30, 200);
        Person sergio = new Person("Sergio", 0, 100000);

        // Initial status
        System.out.println("Initial status: \n" + ana + "\n" + sergio);

        // TESTING SPENDING
        sergio.spend(10);
        ana.spend(10);
        ana.spend(5);
        ana.spend(8);

        // TESTING WITHDRAWING
        sergio.withdraw(200);
        ana.withdraw(300);

        // TESTING SAVING
        ana.save(7);
        sergio.save(100);
        sergio.save(150);

        System.out.println(ana);
        System.out.println(sergio);

    }


}



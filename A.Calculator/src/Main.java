/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator("Texas", "blue");

        int result = calc.add(2, 2);

        System.out.println(result);
    }
}

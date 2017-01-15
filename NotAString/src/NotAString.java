/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class NotAString {

    public static void main(String[] args) {

        notAString("Not funny");
        notAString("super duper funny");
    }

    private static void notAString(String input){

        String auxString = input.substring(0, 4);
        //System.out.println(auxString );

        if (auxString.equalsIgnoreCase("not ")){
            System.out.println(input);
        } else {
            System.out.println("Not " + input);

        }
    }
}

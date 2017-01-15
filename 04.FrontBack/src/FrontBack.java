/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class FrontBack {

    public static void main(String[] args) {

        frontBack("Coisas");
    }

    private static void frontBack(String input){

        char aux = input.charAt( input.length() - 1);

        String result = aux + input.substring(1, input.length()-1) + input.charAt(0);

        System.out.println(result);

    }
}

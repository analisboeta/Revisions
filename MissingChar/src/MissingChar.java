/**
 * Created by Ana Lourenco on 14/01/17 -  Revisions project.
 */
public class MissingChar {

    public static void main(String[] args) {

        missingChar("onomatopeia", 5);

    }

    private static void missingChar(String word, int charNumber){

        System.out.println(word.substring(0, charNumber) + word.substring(charNumber+1));
    }
}

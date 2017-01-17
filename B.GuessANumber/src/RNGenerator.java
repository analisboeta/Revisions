/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class RNGenerator {

    public static int getRandomNumber(int max) {

        return getRandomNumberInRange(0, max);

    }

    public static int getRandomNumberInRange(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }
}



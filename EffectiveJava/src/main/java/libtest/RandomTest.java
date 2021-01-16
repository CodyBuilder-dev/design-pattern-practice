package libtest;

import java.util.Random;

public class RandomTest {
    public static Random rnd = new Random();

    public static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }
}

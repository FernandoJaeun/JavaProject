package exchangeApple;

import java.util.Random;

public class Kkoma {

    private int apple;

    static Random RSP = new Random();

    Kkoma() {
        this.apple = 0;
    }

    public int myRSPis() {
        return RSP.nextInt(6);
    }

    public void addApple(int apple) {
        this.apple += apple;
    }

    public void substractApple(int apple) {
        this.apple -= apple;
    }

    public int getApple() {
        return this.apple;
    }
}
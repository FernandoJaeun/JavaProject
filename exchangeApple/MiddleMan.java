package exchangeApple;

import java.util.Timer;
import java.util.TimerTask;

public class MiddleMan {
    static Timer timer;
    static TimerTask timerTask;

    private static int count;

    public static void main(String[] args) {
        Kkoma jaeYun = new Kkoma();
        Kkoma seoYun = new Kkoma();

        count = 0;
        giveAppleTo(jaeYun, 5);
        giveAppleTo(seoYun, 10);

        System.out.println("가위바위 보!");
        timer  = new Timer();
        timerTask = new TimerTask(){
            @Override
            public void run(){
                while(count<4){
                    tradeApple(jaeYun, seoYun, 2);
                    count ++;
                }
                
            }
        };
        timer.schedule(timerTask, 1000,1000);
    }

    private static void giveAppleTo(Kkoma kkoma, int apples) {
        kkoma.addApple(apples);
    }

    private static void tradeApple(Kkoma kkoma1, Kkoma kkoma2, int apple) {
        if (kkoma1.myRSPis() > kkoma2.myRSPis()) { // 1P가 이겼을 때
            kkoma1.addApple(apple);
            kkoma2.substractApple(apple);
            System.out.println("1P 승 사과 수 : " + kkoma1.getApple());
            System.out.println("2P 패 사과 수 : " + kkoma2.getApple());
        } else if (kkoma2.myRSPis() > kkoma1.myRSPis()) { // 2P가 이겼을 때
            kkoma2.addApple(apple);
            kkoma1.substractApple(apple);
            System.out.println("2P 승 사과 수 : " + kkoma1.getApple());
            System.out.println("1P 패 사과 수 : " + kkoma2.getApple());
        } else {    // 비겼을 때
            System.out.println("무승부");
            return;
        }
    }

}
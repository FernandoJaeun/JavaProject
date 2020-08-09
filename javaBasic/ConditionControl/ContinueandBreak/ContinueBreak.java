package javaBasic.ConditionControl.ContinueandBreak;

public class ContinueBreak {
    public static void main(String[] args) {

        int n = 0;
        int m = 0;

        while (n < 100) {
            System.out.println("n...." + n);
            if (n == 20)
                break;      // 반복문을 탈출한다! == 종료!
            n++;
        }

        while (m < 100) {
            m++;
            if (m % 2 == 0)
                continue;   // 한 싸이클은 건너 뛴다! 조건검사로 이동!
            System.out.println("m...." + m);
        }
    }

}
package javaBasic;

public class InfiniteLoop {
    public static void main(final String[] args) {

        // 6의 배수이자 14의 배수인 가장 작은 정수 찾기!
        int num = 1;
        while (true) {
            if (num % 6 == 0 && num % 14 == 0)
                break;

            num++;
        }
        System.out.println(num);

        int num2 = 1;
        for (;;) {
            if (num2 % 6 == 0 && num2 % 14 == 0)
                break;

            num2++;
        }
        System.out.println(num2);
    }

}
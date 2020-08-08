package javaBasic;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String isTrue = "참입니다!";
        String isFalse = "거짓입니다!";

        System.out.println("a : " + a + ", b : " + b);
        System.out.println("a > b"); // a가 b 보다 크면 참
        if (a > b) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }

        System.out.println("a != b"); // a와 b가 다르면 참
        if (a != b) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }
    }
}
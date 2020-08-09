package javaBasic.operator.binary_operator;
public class LogicOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String isTrue = "참입니다";
        String isFalse = "거짓입니다";

        boolean result1 = (a == 10 && b == 10); // AND 연산자
        boolean result2 = (a == 10 || b == 40); // OR 연산자
        boolean result3 = !(a + b == 20); // NOT 연산자

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.print("a == 10 && b == 10 : "); // a가 10이고 b도 10인 경우 참
        if (result1) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }

        System.out.print("a == 10 || b == 10 : "); // a가 10 이거나 b가 10인 경우 참
        if (result2) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }

        System.out.print("!(a + b == 20) : "); // a + b 가 20이 아닌 경우 참
        if (result3) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }
    }
}
package javaBasic.condition_control.if_else;

public class ConditionOperator {
    public static void main(String[] args) {
        // 조건 연산자 if문과 비슷하지만 조금 가벼운 조건문.

        int num1 = 50;
        int num2 = 100;

        int big, diff;

        big = (num1 > num2) ? num1 : num2;  // num1 > num2 가 참일 경우 참 : 거짓 num1 이 출력되고 거짓일 경우 num2가 출력됨.
        diff = (num1 > num2) ? (num1 - num2) : (num2 - num1); // num1 > num2 가 참일 경우 num1 - num2 가 출력, 거짓일 경우 num2 - num1 이 출력

        System.out.println(big);
        System.out.println(diff);
    }

}
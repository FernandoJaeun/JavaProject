package javaBasic.variable;

public class Literals { // 자료형을 기반으로 표현되는 상수를 의미한다.
                        // 자료형(data type)이란 int, char, boolean 과 같이 데이터를 변수에 담을 때 지정하는 형식(틀) 이다.
    public static void main(String[] args) {
        int num1 = 123; // 10진수인 수 123을 정수형(Integer) 자료형에 담겠다.
        int num2 = 0123; // 8진수인 수 0123을 정수형(Integer) 자료형에 담겠다.
        int num3 = 0x123; // 16진수 수 0x123을 정수형(Integer) 자료형에 담겠다.
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);

        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33)); // 입력은 16진수 이지만, 출력은 10진수
    }
}
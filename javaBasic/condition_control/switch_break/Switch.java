package javaBasic.condition_control.switch_break;

public class Switch {
    public static void main(String[] args) {
        int num1 = 2;

        switch (num1) {
            case 1: // num1 값이 1이면 여기서부터 시작해서 아래를 실행.
                System.out.println("나는 Java 공부가 즐거워~");

            case 2: // num1 값이 2이면 여기서부터 시작해서 아래를 실행.
                System.out.println("진코퍼레이션 bye bye~~");

            case 3: // num1 값이 3이면 여기서부터 시작해서 아래를 실행.
                System.out.println("고수는 기초가 탄탄하다.");

            default: // num1 값이 case문에 없으면 여기를 실행.
                System.out.println("자본주의는 달콤해");
        }
        // case와 defalut를 가리켜 '레이블' 이라고 한다!
    }

}
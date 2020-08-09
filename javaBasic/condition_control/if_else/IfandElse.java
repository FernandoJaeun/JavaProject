package javaBasic.condition_control.if_else;


public class IfandElse {
    public static void main(String[] args) {
        int num = 10;
        int condition = 1;

        String isTrue = " 는 참입니다";
        String isFalse = " 는 거짓입니다.";

        if (num > condition) { // 중괄호는 하나의 문장일 때 생략가능!
            System.out.println(num + " > " + condition + isTrue);
        } else {    // if와 else는 하나의 문장이다! if 조건이 성립 되면 if문 실행, else는 무시, if 조건이 성립 안 되면 else가 실행
            System.out.println(num + " > " + condition + isFalse);
        }

        if (num % 2 == 0)   // 모든 if문은 if~else까지 혹은 if~else if 혹은 if 가 한 문장으로써, 문장안에서는 한 번만 조건이 성립하면 그 문장은 끝난다.
            System.out.println(num + " 은 짝수");
        else
            System.out.println(num + " 은 홀수");


        if( num < 0 )
            System.out.println( num + " 은 음수입니다.");
        else if(num > 0)    // 조건을 한 번더 걸고 싶을 때 else if가 쓰인다!
            System.out.println( num + " 은 양수입니다.");
        else
            System.out.println( num + " 은 수가 아닙니다.");

    }

}
package javaBasic.Operator.BinaryOperator;

public class ArithmeticOperator {
        public static void main(String[] args) {
                   
                int n1 = 7; // 대입 연산자 n1 은 7이다
                int n2 = 3; 

                int result = n1 + n2; // 대입 연산자 + 산술 연산자 n1 과 n2를 더한 값은 result다.

                System.out.println("덧셈 결과 : " + result);
                
                result = n1 - n2 ;

                System.out.println("뺄셈 결과 : " + result);
                System.out.println("곱셈 결과 : " + (n1 * n2));
                System.out.println("나눗셈 몫 결과 : " + (n1 / n2));
                System.out.println("나눗셈 나머지 결과 : " + (n1 % n2));
        }
}
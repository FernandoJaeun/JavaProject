package javaBasic.Operator.BinaryOperator;

public class CompoundAssignment {
    public static void main(String[] args) {
        double e = 3.1;
        System.out.println("e = " + e);  
        e += 2.4;
        System.out.println("e += 2.4 = " + e);  // e에 2.4를 더한 결과
        e -= 1.6;
        System.out.println("e -= 1.6 = " + e);  // e에 1.6을 뺀 결과
        e *= 3.0;
        System.out.println("e *= 2.4 = " + e);  // e에 3.0 실수를 곱한 결과
        e /= 1.5;
        System.out.println("e /= 1.5 = " + e);  // e에 1.5 나눈 몫
        e %= 3.0;
        System.out.println("e %= 3.0 = " + e);  // e에 3.0을 나눈 나머지
    }
}
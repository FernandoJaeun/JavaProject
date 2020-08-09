package javaBasic.Operator.BinaryOperator;

public class ShortCircuitEvaluation {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        boolean result; // 연산 하는 절차를 최대한 줄이기 위해 불필요한 연산은 뒷 부분으로 빼버리는 SCE 작성법

        result = (a += 10) >= 10 && (b += 50) < 0;  // 어차피 False인데 논리연산자의 순서 때문에 뒷 부분까지 훓어버림 : 자원 낭비
        System.out.println(result);

        result = (a += 10) >= 10 || (b += 50) < 0;  // 둘 중 하나만 성립해도 참인 식이 되기 때문에 뒷부분은 볼 것도 없음 : 좋은 코드
        System.out.println(result);

        result = (a += 10) < 5 && (b += 50) > 45;   // 앞 부분 부터 거짓이기 때문에 뒷 부분은 볼 것도 없음 : 좋은 코드
        System.out.println(result);

        result = (a += 10) <= 5 || ( b += 50 ) <70; // 뒷 부분이 먼저 왔으면 연산할 게 하나 줄어들어 자원 낭비 안 할 수 있음 : 자원 낭비
        System.out.println(result);
    }
}

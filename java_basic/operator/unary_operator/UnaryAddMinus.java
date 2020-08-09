package java_basic.operator.unary_operator;

public class UnaryAddMinus {
    public static void main(String[] args) {
        int n1 = 7;
        System.out.println("n1 = " + n1);
        System.out.println("+n1 = "+ (+n1));    // 일반적인 산수와 같이 양수에 양수를 곱하면 양수
        System.out.println("-n1 = "+ (-n1));    // 양수에 음수를 곱하면 음수

        int n2 = -8;
        int n3 = -n2;
        System.out.println("n2 = " + n2);   
        System.err.println("-n2 = " + n3);  // 음수에 음수를 곱하면 양수

        int n4 = 10;
        System.out.println("n4++ = " + n4++);   // 후위 연산자(prefix operator) : 실행된 후에 적용된다.
        System.out.println("후위연산자가 실행된 후의 n4 = " + n4);
        System.out.println("++n4 = " + ++n4);   //전위 연산자(postfix operator) : 실행전에 적용된다.

    }
    
}
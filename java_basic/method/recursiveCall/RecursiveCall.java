package java_basic.method.recursiveCall;

public class RecursiveCall {
    public static void main(String[] args) {
        System.out.println("factorial 5 : " + factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);    // factorial 안에서 계속해서 n*factorial(n-1)이 반복된다!!!
    }
}
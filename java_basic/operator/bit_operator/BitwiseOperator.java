package java_basic.operator.bit_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 13;
        String binaryString1 = Integer.toBinaryString(n1); // n1을 2진수화
        String binaryString2 = Integer.toBinaryString(n2); // n2를 2진수화
        System.out.println(n1 + "의 2진수 = " + binaryString1);
        System.out.println(n2 + "의 2진수 = " + binaryString2);

        int n3 = n1 & n2; // 1010(n1)과 1101(n2)를 비트 연산함
        String binaryString3 = Integer.toBinaryString(n3);
        System.out.println(binaryString1 + " & " + binaryString2 + " = " + binaryString3);
        int decimalN3 = Integer.parseInt(binaryString3, 2);
        System.out.println(binaryString3 + " = " + decimalN3); // 결과

        int n4 = n1 | n2;
        String binaryString4 = Integer.toBinaryString(n4);
        System.out.println(binaryString1 + " | " + binaryString2 + " = " + binaryString4);
        int decimalN4 = Integer.parseInt(binaryString4, 2);
        System.out.println(binaryString4 + " = " + decimalN4);

        byte n5 = (byte) ~n1;
        String binaryString5 = Integer.toBinaryString(n5);
        System.out.println("~" + binaryString1 + " = " + binaryString5);
        System.out.println(binaryString5 + " = " + n5);

        int n6 = n1 ^ n2;
        String binaryString6 = Integer.toBinaryString(n6);
        System.out.println(binaryString1 + " | " + binaryString2 + " = " + binaryString6);
        int decimalN6 = Integer.parseInt(binaryString6, 2);
        System.out.println(binaryString6 + " = " + decimalN6);
    }
}
package javaBasic;

public class BitshiftOperator {
    public static void main(String[] args) {
        System.out.println(2 << 1); // 0000 0010 --> 0000 0100
        System.out.println(2 << 2); // 0000 0010 --> 0000 1000
        System.out.println(2 << 3); // 0000 0010 --> 0001 0000
        System.out.println(2 >> 1); // 0000 0010 --> 0000 0001
        System.out.println(2 >> 2); // 0000 0010 --> 0000 0000
        System.out.println(2 >> 3); // 0000 0010 --> 0000 0000
 
        System.out.println(-2 >>> 1);   // 
        String asd = Integer.toBinaryString(-2);
        String qwe = Integer.toBinaryString(-2 >>> 10);
        System.out.println(asd);
        System.out.println(qwe);

    }
}
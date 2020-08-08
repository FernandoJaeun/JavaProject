package javaBasic;

public class CompoundAssignment {
    public static void main(String[] args) {
        double e = 3.1;
        System.out.println("e += 2.4 = " + e);
        e += 2.4;
        System.out.println("e += 2.4 = " + e);
        e -= 1.6;
        System.out.println("e -= 1.6 = " + e);
        e *= 3.0;
        System.out.println("e *= 2.4 = " + e);
        e /= 1.5;
        System.out.println("e /= 1.5 = " + e);
        e %= 3.0;
        System.out.println("e %= 3.0 = " + e);
    }
}
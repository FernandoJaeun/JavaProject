package javaBasic;

public class NestedLoop {
    public static void main(String[] args) {
        // 반복문은 while, do while, for문이 있는데, 같은 반복문끼리만 중첩이 가능한 사실!
        // while - while, do while - do while, for - for 이렇게!

        // 구구단 만들기
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

}
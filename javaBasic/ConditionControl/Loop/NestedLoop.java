package javaBasic.ConditionControl.Loop;


public class NestedLoop {
    public static void main(String[] args) {
        // 반복문은 while, do while, for문이 있는데, 같은 반복문끼리만 중첩이 가능한 사실!
        // while - while, do while - do while, for - for 이렇게!

        // 구구단 만들기
        for (int i = 1; i < 10; i++) { // 첫 번쨰 반복분이 한 번 실행될 동안
            for (int j = 1; j < 10; j++) { // 두 번째 반복문은 j < 10 이 깨질때까지 실행된다!
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        int i = 1;
        while (i < 10) // 얘는 반복조건에서 변수 선언이 안된다ㅠ
        {
            int j = 1;
            while (j < 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
        }
    }

}
package javaBasic;

public class While {
    public static void main(String[] args) {

        final int reset = 5;
        int num1 = 5;           // 반복의 횟수를 세기 위한 변수
        int condition = 7;      // 반복을 중지시킬 기준이 되는 변수

        while(num1 < condition){                                            // 반복조건, 참일 경우 반복!
            System.out.println("자바를 배우면 프로그래밍이 쉬워요~" + num1);
            num1++;                                                         // 하나씩 더하다가 5가 되면 반복문 종료~!
        }                                                                   // num1이 5보다 큰 경우 실행되지 않는다..ㅠ
        
        num1 = reset;        
                                                                            // do~while문은 조건이 거짓일지라도 한 번은 꼭~ 실행한다!
        do{ 
            System.out.println("자바 vs 파이썬? 고민하지말고 일단 배워!! " + num1);
            num1++;
        }while(num1 < condition);

        
    }
}
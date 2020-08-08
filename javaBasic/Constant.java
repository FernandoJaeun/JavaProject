package javaBasic;


public class Constant {
    
    public static void main(String[] args) {
        final int MAX_SIZE = 100;   // 상수의 변수명은 전부 대문자로 하는 것을 원칙으로 한다. 띄어쓰기는 _로 구분한다.
        final char CONST_CHAR = '상';   // final은 지금 한 번만 선언하겠다는 '지시어'이다.
        final int CONST_ASSIGNED;   // 한번 값이 할당되면 초기화 시킬 수 없다는 뜻이다.
        
        CONST_ASSIGNED = 12;
        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
    }
}
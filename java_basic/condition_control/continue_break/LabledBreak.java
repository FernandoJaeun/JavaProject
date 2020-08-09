package java_basic.condition_control.continue_break;
public class LabledBreak {
    public static void main(String[] args) {

        jaeyunLoop: // 내가 정한 break 구간!!!! 멋있다!!
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println(i + " & " + j);
                if (i == 2 && j == 2) {
                    break jaeyunLoop;
                }   // 기본적인 break는 자신을 감싼 반복문 하나만 탈출할 수 있지만, 임의로 구간을 지정할 경우 둘 이상의 구간을 탈출할 수 있다!!
                    // 하지만 빈번한 사용은 바람직하지 못하다고 한다..
            }
        }

        ferchoLoop:     // continue 또한 레이블로 구간을 정할 수 있다!
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " & " + j);
                if (i == 2 && j == 2) {
                    continue ferchoLoop; // 가장 바깥 반복문으로 이동!
                }   
            }
        }
    }
}
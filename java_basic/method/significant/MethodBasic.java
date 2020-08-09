package java_basic.method.significant;
public class MethodBasic {
    public static void main(String[] args) {
        // 1. 왜 항상 main 인가?
        // 2. String[] args는 뭔가?
        // 3. 메소드는 중괄호 내에 존재하는 문장들을 위 -> 아래 순차적으로 실행

        // 답변
        // 1. java 프로그램의 시작은 main이라는 이름의 메소드를 실행하는 데서부터 시작된다!!!!
        // 2. 이 프로그램을 실행시 커맨드라인으로부터 전달받는 매개변수를 저장하는 배열공간이 된다.
        // 만약 args 값을 출력하는 코드가 있다면 코드대로 실행될 것이다!. 결론은 그냥 배열이며, 프로그램 실행시 사용자가 입력하는 매개변수~
        // 3. 메소드는 하나의 기능을 가진 코드 덩어리이다. void 형식, return(int, String...) 형식의 메소드가 있다.
        // void 형식 : 내부 코드를 실행하고 종료된다.
        // return 형식 : 내부 코드를 실행한 뒤 특정 값(변수)를 반환한다. 반환했으니 받아줄 변수가 있어야 한다.
        // return이 지니는 두 가지 의미 : 값의 반환, 메소드 종료

    }
    
}
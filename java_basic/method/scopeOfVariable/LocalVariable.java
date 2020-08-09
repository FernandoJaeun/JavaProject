package java_basic.method.scopeOfVariable;

public class LocalVariable {
    public static void main(String[] args) {
        boolean scope = true;
        if (scope) {
            int num = 1;
            num ++;
            System.out.println(num);
        }else{
            int num = 5;
            System.out.println(num);
        }
        
        firstMethod();
    }

    public static void firstMethod(){
        // if(scope){
        //     System.out.println(3);
        // }    이 문장은 에러가 발생한다. scope 변수 사용범위를 오버했기 때문이다!
        int num = 3;    // 또한 main 메소드에 있는 num이라는 변수명을 똑같이 사용해도 에러가 나지 않는다. 
                        // 범위를 넘어섰기 때문에 이전에 있던 num이라는 변수는 자동 소멸 상태다!
        System.out.println(num);
    }

}
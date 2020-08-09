package javaBasic.condition_control.switch_break;

public class SwitchBreak {
    public static void main(String[] args) {
        // 앞에서 Swith만 사용했을 경우 첫번째 case문이 실행될 경우 아래까지 연쇄적으로 실행되는 특징이 있었다.
        // 여기선 특정 case만 선별하여 실행할 수 있는 break를 써볼거다!

        int num1 = 2;

        switch (num1) {
            case 1: // num1 값이 1이면 실행.
                System.out.println("나는 Java 공부가 즐거워~");
                break;

            case 2: // num1 값이 2이면 실행.
                System.out.println("진코퍼레이션 bye bye~~");
                break;

            case 3: // num1 값이 3이면 실행.
                System.out.println("고수는 기초가 탄탄하다.");
                break;

            default: // num1 값이 case문에 없으면 여기를 실행.
                System.out.println("자본주의는 달콤해");
        }

        String name = "Fercho";

        switch (name) {
            case "Fercho":
            case "Fernando":    // 콜롬비아에서 나는 여러가지 이름으로 불렸다. 그래도 전부 나를 지칭하는 뜻이었기에 늘 내가 대답을 했다. switch case 문에서도 똑같이 써본다!!
            case "Ferchitto":   // 이렇게 여러 개의 case를 받아 하나의 출력을 만들 수 있다!.
                System.out.println("yo soy Fernando!!");
                break;

            case "Lucas":
            case "Lucca":
                System.out.println("no soy Lucas!!");
                break;

            default:
                System.out.println("Colombia, mi segunda pais me extrano mucho!");

        }
    }

}
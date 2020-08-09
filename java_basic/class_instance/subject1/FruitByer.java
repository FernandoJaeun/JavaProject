package java_basic.class_instance.subject1;

public class FruitByer {
    int cash = 5000; // 소유 현금
    int apples = 0; // 소유 사과

    public void buyApple(FruitSeller seller, int cash) { // seller에게 금액 지불
        if (cash < this.cash) {
            int[] arr = new int[2];
            arr = seller.saleApple(cash);
            apples = arr[0]; // 거래 후 소유 사과
            cash += arr[1]; // 거스름돈 받은 소유 현금
        } else {
            System.out.println(this.cash + "원이 전재산입니다.");
        }
    }

    public void showBuyResult(String name){
        System.out.println("--" + name + "--");
        System.out.println("보유 현금 : " + cash);
        System.out.println("소유 사과 : " + apples);
    }
}
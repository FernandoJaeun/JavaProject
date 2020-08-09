package java_basic.class_instance.instance;

public class FruitSeller {
    private static final int APPLE_PRICE = 1000;
    private static int apples = 20;
    private static int wallet = 0;

    
    public int[] saleApple(int income) {
        final int[] arr = new int[2];

        arr[0] = income / APPLE_PRICE; // 사과
        arr[1] = income % APPLE_PRICE; // 거스름돈 
        apples -= arr[0];
        wallet += arr[0] * APPLE_PRICE;
        return arr;
    }

    public void showSaleResult(String name){
        System.out.println("--" + name + "--");
        System.out.println("남은 사과 : " + apples);
        System.out.println("판매 수익 : " + wallet);
    }
}

package java_basic.class_instance.instance;

public class AppleStore {
    public static void main(String[] args) {
        FruitByer jaeyun = new FruitByer();
        FruitSeller seoyun = new FruitSeller();

        int cash = 5700;
        jaeyun.buyApple(seoyun, cash);
        jaeyun.showBuyResult(jaeyun.getClass().getSimpleName());

        seoyun.showSaleResult(seoyun.getClass().getSimpleName());
    }
    
}
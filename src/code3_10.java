import java.util.HashMap;

enum CoffeePrice {
    AMERICANO,
    ICE_AMERICANO,
    CAFFE_LATTE
};

public class code3_10 {
    static void printCoffeePrice(CoffeePrice type) {
        HashMap<CoffeePrice, Integer> priceMap = new HashMap<>();

        priceMap.put(CoffeePrice.AMERICANO, 3000);
        priceMap.put(CoffeePrice.ICE_AMERICANO, 4000);
        priceMap.put(CoffeePrice.CAFFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.printf("가격은 %d원입니다.\n", price);
    }
    public static void main(String []args){
        printCoffeePrice(CoffeePrice.AMERICANO);
        printCoffeePrice(CoffeePrice.CAFFE_LATTE);
    }
}

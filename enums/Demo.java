enum Laptops {
    Macbook(2000), ThinkPad(1200), Neo(800), BookPro(2200);

    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}


public class Demo {
    public static void main(String[] args) {
        
        for(Laptops lap : Laptops.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
        
    }
}

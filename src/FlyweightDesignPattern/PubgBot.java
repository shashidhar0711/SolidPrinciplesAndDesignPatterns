package FlyweightDesignPattern;

public class PubgBot implements Bot {
    String name;
    int size;
    int weight;
    float height;

    public PubgBot(String name, int size, int weight, float height) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void crateNewBot(String dressColor, String gunColor) {
        System.out.println("DressColor is: "+dressColor+" GunColor is: "+gunColor);
    }
}

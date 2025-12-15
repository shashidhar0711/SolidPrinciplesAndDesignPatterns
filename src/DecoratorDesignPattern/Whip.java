package DecoratorDesignPattern;

public class Whip implements Beverages{

    Beverages b;

    Whip(Beverages b) {
        this.b = b;
    }

    @Override
    public int getPrice() {
        return 80 + b.getPrice();
    }
}

package DecoratorDesignPattern;

public class Mocha implements Beverages {

    Beverages b;

    Mocha(Beverages b) {
        this.b = b;
    }
    @Override
    public int getPrice() {
        return 40 + b.getPrice();
    }
}

package DecoratorDesignPattern;

public class Milk implements Addons{
    Beverages b;

    Milk(Beverages b) {
        this.b = b;
    }
    @Override
    public int getPrice() {
        return 25 + b.getPrice();
    }
}

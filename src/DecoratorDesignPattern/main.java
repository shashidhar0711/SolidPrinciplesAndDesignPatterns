package DecoratorDesignPattern;

public class main {
    static void main(String[] args) {
        Beverages b = new Latte();
        b = new Milk(b);
        b = new Mocha(b);

        Beverages c = new Espresso();
        c = new Whip(c);

        System.out.println(b.getPrice());
        System.out.println(c.getPrice());
        System.out.println("Debug");
    }
}

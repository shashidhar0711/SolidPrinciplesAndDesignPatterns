package FlyweightDesignPattern;

public class main {
    static void main(String[] args) {
       PubgBot whiteBot = PubgFactoryAndRegistry.getPubgBotType("WhiteGuy", 12, 50, 6);
       whiteBot.crateNewBot("Black", "white");
       whiteBot.crateNewBot("Red", "Orange");

       System.out.println("debug");
    }
}

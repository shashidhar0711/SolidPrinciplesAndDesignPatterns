package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class PubgFactoryAndRegistry {

    static PubgBot pubgBot;
    public static final Map<String, PubgBot> botInstance = new HashMap<>();

    public static PubgBot getPubgBotType(String name, int size, int weight, float height) {
        String key = name+ "-" +size+ "-" + weight+ "-" +height;

        if(!botInstance.containsKey(key)) {
            pubgBot = new PubgBot(name, size, weight, height);
            botInstance.put(key, pubgBot);
        }

        return botInstance.get(key);
    }
}

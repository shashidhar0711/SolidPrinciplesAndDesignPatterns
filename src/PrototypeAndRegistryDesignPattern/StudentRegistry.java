package PrototypeAndRegistryDesignPattern;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> RegistryMap = new HashMap<>();

    public void Add(String key, Student value) {
        RegistryMap.put(key, value);
    }

    public Student Get(String key) {
        return RegistryMap.get(key).clone();
    }
}

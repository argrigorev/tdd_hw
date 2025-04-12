package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, Integer> nameToNumber = new HashMap<>();

    public int add(String name, int number) {
        if(!nameToNumber.containsKey(name)){
            nameToNumber.put(name, number);
        }
        return nameToNumber.size();
    }
}

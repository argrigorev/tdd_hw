package ru.netology;

import java.util.*;

public class PhoneBook {
    private final Map<String, Integer> nameToNumber = new TreeMap<>();
    private final Map<Integer, String> numberToName = new HashMap<>();

    public int add(String name, int number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
        }
        return nameToNumber.size();
    }

    public String findByNumber(int number) {
        return numberToName.get(number);
    }

    public int findByName(String name) {
        return nameToNumber.get(name);
    }

    public List<String> printAllNames(){
        return new ArrayList<>(nameToNumber.keySet());
    }
}

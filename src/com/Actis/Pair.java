package com.Actis;

import com.Values.Value;

// Единица хранения пары ключ:значение ничего не знает про Value, просто "прослойка"
public class Pair {
    private String key;
    private Value value;

    public Pair(String key, Value value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }

    public String toString() {
        return ""; //TODO
    }
}

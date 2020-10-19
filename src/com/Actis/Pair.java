package com.Actis;

import com.Values.*;

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

    public void setValue(Value value) {
        this.value = value;
    }

    public void setValue(String key,Value newValue) {
        if (this.key == key) {
            setValue(newValue);
        } else {
            ((ValueHashSet)value).setPair(key, newValue);
        }
    }

    public String toString() {
        return "\"" + this.key + "\": " + this.value.toString() + ",\n";
    }

    public void processString(String s){
        this.value = new ValueHashSet(s);
    }

    public String toXML() {
        return "<" + this.key + ">" + this.value.toString() + "</" + this.key + ">" + "\n";
    }
}

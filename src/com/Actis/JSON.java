package com.Actis;

import com.Values.Value;
import com.Values.ValueHashSet;

public class JSON {
    Pair values;

    public JSON() {
        this.values = new Pair("root", new ValueHashSet());
    }

    public void parseFromFile(String path) {
        return; //TODO
    }

    public String toString() {
        return ""; //TODO
    }

    public Value getValueToKey(String key) {
        Value value = null;
        return value; // TODO
    }

    public void setValueToKey(String key, Value value) {
        return; //TODO
    }

    public void add(String parentKey, String key, Value value) {
        return; // TODO
    }
}

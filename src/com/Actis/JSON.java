package com.Actis;

import com.Values.Value;
import com.Values.ValueHashSet;

// Класс для хранения всего JSON контейнера должен уметь заполняться и обрабатывать внутренне состояние JSON.
public class JSON {
    Pair values;

    public JSON() {
        this.values = new Pair("root", new ValueHashSet());
    }

    public void parseFromFile(String path) {
        return; //TODO
    }

    public String toXML() {
        return ""; //TODO
    }

    public String toString() {
        return ""; //TODO
    }

    public Value getValueByKey(String key) {
        Value value = null;
        return value; // TODO
    }

    public void addPair(String parentKey, String key, Value value) {
        return; // TODO
    }

    public void addPair(String key, Value value) {
        addPair("root", key, value);
    }

    public void setValueByKey(String key, Value value) {
        // найти пару по ключу и сделать Set
        return; //TODO
    }
}

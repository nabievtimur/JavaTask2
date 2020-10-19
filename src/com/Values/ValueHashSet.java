package com.Values;

import com.Actis.Pair;
import java.util.HashSet;
import java.util.Iterator;

public class ValueHashSet implements Value {
    HashSet<Pair> records;

    public ValueHashSet() {
        this.records = new HashSet<>();
    }

    @Override
    public Type getType() {
        return Type.Record;
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    public String toString() {
        return ""; //TODO
    }

    public void setPair(String key,Value newValue) {
        Iterator<Pair> iterator = records.iterator();
        while (iterator.hasNext()) {
            Pair iter = iterator.next();
            if (iter.getValue().getType() == Type.Record) {
                iter.setValue(key, newValue);
            }
        }
    }
}

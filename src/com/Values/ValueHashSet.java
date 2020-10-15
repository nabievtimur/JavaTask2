package com.Values;

import com.Actis.Pair;
import java.util.HashSet;

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
}

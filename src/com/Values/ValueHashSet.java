package com.Values;

import com.Actis.Pair;
import com.Values.Value;

import java.util.HashSet;

public class ValueHashSet implements Value {
    HashSet<Pair> records;

    @Override
    public Type getType() {
        return Type.Record;
    }

    public String toString() {
        return ""; //TODO
    }

    public ValueHashSet() {
        this.records = new HashSet<>();
    }
}

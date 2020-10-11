package com.Values;

import java.util.ArrayList;

public class ValueArray implements Value {
    ArrayList<String> values;

    public ValueArray() {
        this.values = new ArrayList<>();
    }

    @Override
    public Type getType() {
        return Type.Array;
    }

    @Override
    public boolean add(Value value) {
        return false; //TODO
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    public ArrayList<String> getValue() {
        return values;
    }
}

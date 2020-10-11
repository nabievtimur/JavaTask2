package com.Values;

import java.util.ArrayList;

public class ValueArray implements Value {
    ArrayList<Integer> values;

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

    public ArrayList<Integer> getValue() {
        return values;
    }
}

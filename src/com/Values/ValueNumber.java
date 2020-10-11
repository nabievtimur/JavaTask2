package com.Values;

public class ValueNumber implements Value {
    int value;

    ValueNumber() {
        this.value = 0;
    }

    @Override
    public Type getType() {
        return Type.Number;
    }

    @Override
    public boolean add(Value value) {
        return false; //TODO
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }
}

package com.Values;

public class ValueNumber implements Value {
    int value;

    ValueNumber() {
        this.value = 0;
    }

    public ValueNumber(int value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return Type.Number;
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }
}

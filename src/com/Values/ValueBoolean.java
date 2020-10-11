package com.Values;

public class ValueBoolean implements Value {
    boolean value;

    ValueBoolean() {
        this.value = false;
    }

    @Override
    public Type getType() {
        return Type.Boolean;
    }

    @Override
    public boolean add(Value value) {
        return false; //TODO
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    public boolean getValue() {
        return value;
    }
}

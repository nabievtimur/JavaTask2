package com.Values;

public class ValueBoolean implements Value {
    boolean value;

    ValueBoolean() {
        this.value = false;
    }

    public ValueBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return Type.Boolean;
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    public boolean getValue() {
        return value;
    }
}

package com.Values;

public class ValueString implements Value {
    String value;

    ValueString() {
        this.value = "";
    }

    @Override
    public Type getType() {
        return Type.String;
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

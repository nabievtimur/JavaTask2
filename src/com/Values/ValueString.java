package com.Values;

public class ValueString implements Value {
    String value;

    ValueString() {
        this.value = "";
    }

    public ValueString(String value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return Type.String;
    }

    @Override 
    public String toString() {
        return "\"" + this.value + "\"";
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }
}

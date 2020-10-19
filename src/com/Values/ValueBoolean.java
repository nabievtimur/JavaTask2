package com.Values;

public class ValueBoolean implements Value {
    boolean value;

    ValueBoolean() {
        this.value = false;
    }

    public ValueBoolean(boolean value) {
        this.value = value;
    }

    public ValueBoolean(String str) {
        if (str.equals("true")){
            this.value = true;
        } else {
            this.value = false;
        }
    }

    @Override
    public Type getType() {
        return Type.Boolean;
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    @Override
    public String toString(){
        return Boolean.toString(this.value);
    }

    public boolean getValue() {
        return value;
    }
}

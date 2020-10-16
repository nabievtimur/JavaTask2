package com.Values;

public class ValueNumber implements Value {
    int value;

    ValueNumber() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }
 
    public ValueNumber(int value) {
        this.value = value;
    }

    public ValueNumber(String str) {
        this.value = Integer.parseInt(str);
    }

    @Override
    public Type getType() {
        return Type.Number;
    }

    @Override
    public boolean setValue(Value newValue) {
        if (newValue.getType() == Type.Number) {
            this.value = ((ValueNumber)newValue).getValue();
            return true;
        }
        return false; 
    }

    @Override
    public String toString(){
        return Integer.toString(this.value);
    }

}

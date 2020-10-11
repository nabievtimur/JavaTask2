package com.Values;

public interface Value {
    enum Type {
        Record,
        Array,
        Number,
        Boolean,
        String
    }

    public String toString();
    public Type getType();
    public void add(Value value);
}

// TODO other implements Value
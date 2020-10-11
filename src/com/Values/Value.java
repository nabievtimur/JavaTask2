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
    public boolean add(Value value);
    public boolean setValue(Value value);
}

// TODO other implements Value
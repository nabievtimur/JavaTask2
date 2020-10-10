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
}

// TODO other implements Value
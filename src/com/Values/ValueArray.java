package com.Values;

import java.util.ArrayList;
import java.util.Iterator;

public class ValueArray implements Value {
    ArrayList<String> values;

    public ValueArray() {
        this.values = new ArrayList<>();
    }

    public ValueArray(String s) {
        StringBuilder str = new StringBuilder(s);
        this.values = new ArrayList<>();
        while (str.toString().contains("\"")) 
        {
            char ch = str.charAt(1);

            while (ch != '"') {
                str.deleteCharAt(1);
                ch = str.charAt(1);
            }

            str.deleteCharAt(1);
            int index = str.indexOf(String.valueOf(ch));
            String sub_str = str.substring(1, index);
            str.delete(1, index+1);
            
            this.values.add(sub_str);
        }
    }

    @Override
    public Type getType() {
        return Type.Array;
    }

    @Override
    public boolean setValue(Value value) {
        return false; //TODO
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        Iterator<String> it = values.iterator();
        res.append("\n");
        while(it.hasNext()){
            res.append("\"" + it.next().toString() + "\"");
            if (it.hasNext()){
                res.append(", ");
            }
            res.append("\n");
        }
        return "[" + res + "]";
    }

    public ArrayList<String> getValue() {
        return values;
    }
}

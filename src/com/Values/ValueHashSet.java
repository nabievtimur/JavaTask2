package com.Values;

import com.Actis.Pair;
import java.util.HashSet;
import java.util.Iterator;

public class ValueHashSet implements Value {
    HashSet<Pair> records;

    public ValueHashSet() {
        this.records = new HashSet<>();
    }

    public ValueHashSet(String s) {
        StringBuilder str = new StringBuilder(s);

        this.records = new HashSet<>();
        while ((str.toString().contains("\""))) {

            char ch = str.charAt(1);

            while (ch != '"') {
                str.deleteCharAt(1);
                ch = str.charAt(1);
            }

            //выделяем ключ
            str.deleteCharAt(1); 
            int index = str.indexOf(String.valueOf(ch));
            String sub_str = str.substring(1, index);
            str.delete(1, index+1);
            String new_pair_key = sub_str;
   
            ch = str.charAt(1);
            while ((ch == ' ') || (ch == ':')){
                str.deleteCharAt(1);
                ch = str.charAt(1);
            }

            //выделяем объект
            switch (ch) {
                case '{': {
                    index = str.indexOf(String.valueOf('}'));
                    sub_str = str.substring(1, index+1);
                    str.delete(1, index+1);
                    this.records.add(new Pair(new_pair_key, new ValueHashSet(sub_str)));
                    
                    break;
                }
                case '[': {
                    index = str.indexOf(String.valueOf(']'));
                    sub_str = str.substring(1, index+1);
                    str.delete(1, index+1);
                    this.records.add(new Pair(new_pair_key, new ValueArray(sub_str)));
                    break;
                }
                case '"': {
                    index = str.indexOf(String.valueOf('"'), 2);
                    sub_str = str.substring(2, index);
                    str.delete(1, index+1);
                    this.records.add(new Pair(new_pair_key, new ValueString(sub_str)));
                    break;
                }
                //
                default: {
                    int i = 1;
                    ch = str.charAt(i);
                    while ((ch != ' ') && (ch != '}') && (ch != ','))
                    {
                        i++;
                        ch = str.charAt(i);
                    }
                    sub_str = str.substring(1, i);
                    str.delete(1, i+1);
                    if ((sub_str.charAt(0) == 't') || (sub_str.charAt(0) == 'f')){
                        this.records.add(new Pair(new_pair_key, new ValueBoolean(sub_str))); //обрабатываем boolean
                    } else{
                        this.records.add(new Pair(new_pair_key, new ValueNumber(sub_str)));
                    }
                }
            }
        }
    }

    @Override
    public Type getType() {
        return Type.Record;
    }

    @Override
    public boolean setValue(Value newValue) {
        return false; //TODO
    }

    public String toString() {
        StringBuilder res = new StringBuilder("");
        Iterator<Pair> it = records.iterator();
        res.append("\n");
        while(it.hasNext()){
            res.append(it.next().toString());
        }
        return "{" + res + "}";
    }

    public void addPair(String parentKey, String key, Value newValue) {
    }

    public void setPair(String key,Value newValue) {
        Iterator<Pair> iterator = records.iterator();
        while (iterator.hasNext()) {
            Pair iter = iterator.next();
            if (iter.getValue().getType() == Type.Record) {
                iter.setValue(key, newValue);
            }
        }
    }
}

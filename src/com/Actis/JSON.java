package com.Actis;

import com.Values.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

// Класс для хранения всего JSON контейнера должен уметь заполняться и обрабатывать внутренне состояние JSON.
public class JSON {
    Pair values;

    public JSON() {
        this.values = new Pair("root", new ValueHashSet());
    }

    private void process_array(String key, String s) {
        Value res = new ValueArray();
        StringBuilder str = new StringBuilder(s);
        while (!(str.toString().equals("[]")))
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
            Value new_str = new ValueString(sub_str);

            res.add(new_str);
        }
        this.setValueToKey(key, res);
    }

    private void process_string(String key, String s) {
        Value res = new ValueString(s);
        this.setValueToKey(key, res);
    }

    private void process_boolean(String key, String s) {
        Value res;
        if (s.equals("true")){
            res = new ValueBoolean(true);
        } else {
            res = new ValueBoolean(false);
        }
        this.setValueToKey(key, res);
    }

    private void process_int(String key, String s) {
        Value res = new ValueNumber(Integer.parseInt(s));
        this.setValueToKey(key, res);
    }

    private void process_object(String parent, String s) {
        StringBuilder str = new StringBuilder(s);
        System.out.println(str);

        Value set = new ValueHashSet();
        while (!(str.toString().equals("{}"))) {

            char ch = str.charAt(1);

            while (ch != '"') {
                str.deleteCharAt(1);
                ch = str.charAt(1);
            }

            str.deleteCharAt(1);
            int index = str.indexOf(String.valueOf(ch));
            String sub_str = str.substring(1, index);
            str.delete(1, index+1);
            String new_pair_key = sub_str;

            //System.out.println(sub_str);
   
            while ((ch == ' ') || (ch == ':')){
                str.deleteCharAt(1);
                ch = str.charAt(1);
            }

            switch (ch) {
                case '{': {
                    index = str.indexOf(String.valueOf('}'));
                    sub_str = str.substring(1, index+1);
                    str.delete(1, index+1);
                    this.add(parent, new_pair_key, new ValueHashSet());
                    process_object(new_pair_key, sub_str); //обрабатываем вложенный объект 
                    break;
                }
                case '[': {
                    index = str.indexOf(String.valueOf(']'));
                    sub_str = str.substring(1, index+1);
                    str.delete(1, index+1);
                    this.add(parent, new_pair_key, new ValueArray());
                    process_array(new_pair_key, sub_str); //обрабатываем вложенный массив 
                    break;
                }
                case '"': {
                    index = str.indexOf(String.valueOf('"'), 2);
                    sub_str = str.substring(2, index);
                    str.delete(1, index+1);
                    this.add(parent, new_pair_key, new ValueString(""));
                    process_string(new_pair_key, sub_str); //обрабатываем строку
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
                    if ((str.charAt(1) == 't') || (str.charAt(1) == 'f')){
                        this.add(parent, new_pair_key, new ValueBoolean(true));
                        process_boolean(new_pair_key, sub_str); //обрабатываем boolean
                    } else{
                        this.add(parent, new_pair_key, new ValueNumber(0));
                        process_int(new_pair_key, sub_str); //обрабатываем число
                    }
                }
            }
        }
    }
 
    public void parseFromFile(String path) {
        try(FileReader reader = new FileReader(path))
        {
            int c; 
            StringBuilder str = new StringBuilder("");
            //сохраняем данные их файла в строку 
            while((c = reader.read()) != -1){
                if (((char)c != '\n'))
                    str.append(String.valueOf((char)c));
            }
            process_object("root", str.toString()); //обрабатываем внешний объект
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    }

    public String toXML() {
        return ""; //TODO
    }

    public String toString() {
        return ""; //TODO
    }

    public Value getValueByKey(String key) {
        Value value = null;
        return value; // TODO
    }

    public void addPair(String parentKey, String key, Value value) {
        return; // TODO
    }

    public void addPair(String key, Value value) {
        addPair("root", key, value);
    }

    public void setValueByKey(String key, Value value) {
        // найти пару по ключу и сделать Set
        return; //TODO
    }
}

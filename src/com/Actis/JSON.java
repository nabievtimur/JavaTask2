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
 
    public void parseFromFile(String path) {
        try(FileReader reader = new FileReader(path))
        {
            int c; 
            StringBuilder str = new StringBuilder("");
            //сохраняем данные из файла в строку 
            while((c = reader.read()) != -1){
                if (((char)c != '\n'))
                    str.append(String.valueOf((char)c));
            }
            this.values.processString(str.toString()); //обрабатываем внешний объект
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }   
    }

    public String toXML() {
        return this.values.toXML();
    }

    public String toString() {
        return this.values.toString(); //TODO
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

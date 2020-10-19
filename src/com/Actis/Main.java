package com.Actis;

import com.Values.ValueArray;
import com.Values.ValueHashSet;
import com.Values.ValueString;

public class Main {

    public static void main(String[] args) {
        JSON json = new JSON();
        // должен распрарсить файл, вывести точно также, что-то корректно поменять и вывести изменнённый JSON
        json.parseFromFile("path to test file");
        System.out.println(json.toString());
        json.addPair("root", "emails", new ValueArray());
        json.addPair("", "emails", new ValueString("kinimon@mail.ru"));
        json.addPair("", "emails", new ValueString("kandjuro@mail.ru"));
        json.addPair("", "emails", new ValueString("raizo@mail.ru"));
        json.setValueByKey("lastName", new ValueString("Синявский"));
        //...
        System.out.println(json.toString());
        System.out.println(json.toXML());
    }
}

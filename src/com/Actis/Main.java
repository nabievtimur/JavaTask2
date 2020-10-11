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
        json.add("root", "emails", new ValueArray());
        json.add("", "emails", new ValueString("kinimon@mail.ru"));
        json.add("", "emails", new ValueString("kandjuro@mail.ru"));
        json.add("", "emails", new ValueString("raizo@mail.ru"));
        json.setValueToKey("lastName", new ValueString("Синявский"));
        //...
        System.out.println(json.toString());
    }
}

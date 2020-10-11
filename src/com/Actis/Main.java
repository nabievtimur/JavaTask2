package com.Actis;

import com.Values.ValueHashSet;

public class Main {

    public static void main(String[] args) {
        JSON json = new JSON();
        json.parseFromFile("path");
        json.add("root", "emails", new ValueHashSet());



    }
}

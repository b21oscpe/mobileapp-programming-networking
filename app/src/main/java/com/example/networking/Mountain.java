package com.example.networking;

public class Mountain {

    private String id;
    private String name;
    private String location;
    private int height;
    private int cost;


    public Mountain(String id, String name, String location, int height, int cost, Auxdata auxdata) {
        id = id;
        name = name;
        location = location;
        height = height;
        cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }

    public int getCost() {
        return cost;
    }
}
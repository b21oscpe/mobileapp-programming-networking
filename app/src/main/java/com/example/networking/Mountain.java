package com.example.networking;

public class Mountain {

    private String id;
    private String name;
    private String location;
    private int height;
    private int cost;
    private Auxdata auxdata;


    public Mountain(String id, String name, String location, int height, int cost, Auxdata auxdata) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.height = height;
        this.cost = cost;
        this.auxdata = auxdata;
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

    public Auxdata getAuxdata() {
        return auxdata;
    }
}
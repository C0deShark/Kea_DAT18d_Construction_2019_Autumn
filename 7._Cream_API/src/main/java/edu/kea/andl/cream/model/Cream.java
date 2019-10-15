package edu.kea.andl.cream.model;

public class Cream {
    public String name;

    // todo add: createdBy, bestBy and isExpired
    // createdBy is a timestamp
    // bestBy: add 1 week to createdBy
    // isExpired: true if now is later than bestBy
            // hint: ternary statement


    public Cream(String name) {
        this.name = name;
    }
}

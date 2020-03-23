package com.example;

import java.util.ArrayList;


class Printer {

    private ArrayList<User> users = new ArrayList<User>();

    public Printer() {
        this.users.add(new User("Mario", 34));
        this.users.add(new User("Adrian", 54));
    }

    public void printProperties() {
        for (Integer i=0; i< this.users.size(); i++) {
            String result = "\n";
            result += this.users.get(i).getName();
            result += " ";
            result += this.users.get(i).getAge();
            System.out.printf(result);
        }
    }
}
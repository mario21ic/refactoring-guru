package com.example;

import java.util.ArrayList;


class PrinterSolved {

    private ArrayList<User> users = new ArrayList<User>();

    public PrinterSolved() {
        this.users.add(new User("Mario", 34));
        this.users.add(new User("Adrian", 54));
    }

    private String getproperties(User user) {
        return String.format("%s %s", user.getName(), user.getAge());
    }
    public void printProperties() {
        for (User user : this.users) {
            System.out.println(this.getproperties(user));
        }
    }
}
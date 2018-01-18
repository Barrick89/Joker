package com.udacity.gradle.builditbigger.backend;

import com.mahausch.jokelib.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = JokeTeller.getJoke();
        return myData;
    }
}
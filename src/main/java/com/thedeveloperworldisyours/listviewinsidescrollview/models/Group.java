package com.thedeveloperworldisyours.listviewinsidescrollview.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 11/5/15.
 */
public class Group {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }

}
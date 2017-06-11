package com.jiyoun.teampleboard;

/**
 * Created by kim Ji Youn on 2017-06-11.
 */

public class ProjectItem {

    String Name;
    String Date;
    

    public ProjectItem(String name, String date) {
        Name = name;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }


    @Override
    public String toString() {
        return "ProjectItem{" +
                "Name='" + Name + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}

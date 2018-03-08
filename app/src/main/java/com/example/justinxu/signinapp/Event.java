package com.example.justinxu.signinapp;

/**
 * Represents the information of an event of the TriV Coder Dojo.
 */

public class Event {

    private String mDate;
    private String memberName;

    public Event() {

    }

    public String getDate() {
        return mDate;
    }
    public void setDate(String date) {
        mDate = date;
    }

    public String getName() {
        return memberName;
    }
    public void setName(String name) {
        memberName = name;
    }

}

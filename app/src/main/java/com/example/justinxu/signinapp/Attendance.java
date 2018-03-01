package com.example.justinxu.signinapp;

/**
 * Created by hemankolla on 2/28/18.
 */

public class Attendance {

    private String memberArrivalTime;
    private String memberDepartureTime;
    private String memberNotes;

    public Attendance() {

    }

    public String getArrivalTime() {
        return memberArrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        memberArrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return memberDepartureTime;
    }
    public void setDepartureTime(String departureTime) {
        memberDepartureTime = departureTime;
    }

    public String getNotes() {
        return memberNotes;
    }
    public void setNotes(String notes) {
        memberNotes = notes;
    }

}



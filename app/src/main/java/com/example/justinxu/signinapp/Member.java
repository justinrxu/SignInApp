package com.example.justinxu.signinapp;

/**
 * Represents the information of a single member in the TriV Coder Dojo.
 */

public class Member {

    private String firstName;
    private String lastName;
    private String memberType;
    private int memberId;

    public Member() {

    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String first) {
        firstName = first;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String last) {
        lastName = last;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int id) {
        memberId = id;
    }

    public String getType() {
        return memberType;
    }
    public void setType(String type) {
        memberType = type;
    }

}

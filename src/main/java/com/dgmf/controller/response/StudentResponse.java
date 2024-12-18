package com.dgmf.controller.response;

public class StudentResponse {
    private int id;
    private String firstName;
    private String lastName;

    public StudentResponse(int id, String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

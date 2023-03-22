package com.example.week9;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int picture;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getPicture() {return picture;}

    public User(String firstName, String lastName, String email, String degreeProgram, int picture){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.degreeProgram=degreeProgram;
        this.picture=picture;
    }
}

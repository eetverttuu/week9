package com.example.week9;

import android.text.Editable;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage(){
    }

    public static UserStorage getInstance(){
        if(userStorage==null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers() {
        return users;
    }


    public void removeUser(int id){

    }

    public void addUser(String firstName, String lastName, String email, String degreeProgram, int picture) {
        User newUser = new User(firstName, lastName, email, degreeProgram, picture);
        users.add(newUser);
    }
}

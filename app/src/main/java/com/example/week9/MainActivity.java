package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAddStudent(View view){
        Intent intent = new Intent(this, AddNewUserActivity.class);
        startActivity(intent);
    }

    public void switchToListAllStudents(View view){
        Intent intent = new Intent(this, ListAllUsersActivity.class);
        startActivity(intent);
    }

}
package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;


public class AddNewUserActivity extends AppCompatActivity {

    private EditText firstName, lastName, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_user);

        firstName = findViewById(R.id.txtUserFirstName);
        lastName = findViewById(R.id.txtUserLastName);
        email = findViewById(R.id.txtUserEmail);
    }

    public void addUser(View view) {
        UserStorage us = UserStorage.getInstance();
        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeType);
        String degreeProgram = null;
        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rdTite:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rdEnte:
                degreeProgram = "Energiatekniikka";
                break;
            case R.id.rdTuta:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rdLate:
                degreeProgram = "Laskennallinen tekniikka";
                break;
        }
        RadioGroup rgUserImage = findViewById(R.id.rgImage);
        int picture = 0;
        switch (rgUserImage.getCheckedRadioButtonId()) {
            case R.id.rbSpongebob:
                picture = R.drawable.spongebob;
                Log.d("IMAGEDEBUG", "1 ");
                break;
            case R.id.rbMM:
                picture = R.drawable.mm;
                break;
            case R.id.rbBatman:
                picture = R.drawable.batman;
                break;
            case R.id.rbBaby:
                picture = R.drawable.baby;
                break;
        }
        us.addUser(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeProgram, picture);
    }
}
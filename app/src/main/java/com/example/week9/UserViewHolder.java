package com.example.week9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView firstNameLastname, email, degreeProgram;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        firstNameLastname = itemView.findViewById(R.id.txtFirstNameLastName);
        email =  itemView.findViewById(R.id.txtEmail);
        degreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
    }
}

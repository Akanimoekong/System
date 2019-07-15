package com.example.alc4_0phase1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("My Profile");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

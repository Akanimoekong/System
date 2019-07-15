package com.example.alc4_0phase1;

import androidx.appcompat.app.AppCompatActivity;
 

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("ALC 4 Phase 1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gotoActivity2(View view) {
        Intent intent = new Intent (this, MyProfile.class);
        startActivity(intent);
    }

    public void MyActivity(View view) {
        Intent intent = new Intent (this, AboutALC.class);
        startActivity(intent);
    }
}

package com.awatin.leo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AwatinLeoLab5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awatin_leo_lab5_1);
        this.setTitle("Activity 2");
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnmap1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:10.660639,123.144660"));
            chooser = Intent.createChooser(i, "Choose map app");
            startActivity(chooser);
        }
        else if (v.getId() == R.id.activity1) {
            i  = new Intent ( this, AwatinLeoLab5.class);
            startActivity(i);
        }
    }
}

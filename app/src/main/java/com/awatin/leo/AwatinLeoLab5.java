package com.awatin.leo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AwatinLeoLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awatin_leo_lab5);
    }

    public void process (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.activity2) {
            i = new Intent(this, AwatinLeoLab5_1.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnmap1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://10.682646,122.957386"));
            chooser = Intent.createChooser(i, "Choose map app");
            startActivity(chooser);
        }
    }
}

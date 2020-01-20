package com.jpitkonen.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView teksti;
    private Button nappi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teksti = (TextView) findViewById(R.id.textView);
        nappi = (Button) findViewById(R.id.button);

        nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teksti.setText("Eka mobiilisovellus!");
                teksti.setTextColor(Color.BLUE);
            }
        });
    }
}

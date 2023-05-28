package com.example.radioswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout L;
    Switch Sw;
    RadioGroup Rg;
    RadioButton Rb1;
    RadioButton Rb2;
    RadioButton Rb3;
    RadioButton Rb4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sw = findViewById(R.id.switch1);
        Rg = findViewById(R.id.radio1);
        btn = findViewById(R.id.button);
        Rb1 = findViewById(R.id.radioButton);
        Rb2 = findViewById(R.id.radioButton2);
        Rb3 = findViewById(R.id.radioButton3);
        Rb4 = findViewById(R.id.radioButton4);
        L = findViewById(R.id.Linear);

        if (!(Sw.isChecked())) {
            if (Rb1.isChecked()) {
                L.setBackgroundColor(Color.YELLOW);
            } else if (Rb2.isChecked()) {
                L.setBackgroundColor(Color.GRAY);
            } else if (Rb3.isChecked()) {
                L.setBackgroundColor(Color.MAGENTA);
            } else if (Rb4.isChecked()) {
                L.setBackgroundColor(Color.CYAN);
            } else {
                L.setBackgroundColor(Color.WHITE);
            }
        }
    }

    public void clicked(View view) {
        if (Sw.isChecked()){
            if (Rb1.isChecked()){
                L.setBackgroundColor(Color.RED);
            }
            else if (Rb2.isChecked()){
                L.setBackgroundColor(Color.BLUE);
            }
            else if(Rb3.isChecked()){
                L.setBackgroundColor(Color.GREEN);
            }
            else if (Rb4.isChecked()){
                L.setBackgroundColor(Color.BLACK);
            }
            else {
                L.setBackgroundColor(Color.WHITE);
            }
        }
    }
}
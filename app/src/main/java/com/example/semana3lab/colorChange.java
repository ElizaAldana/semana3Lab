package com.example.semana3lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class colorChange extends AppCompatActivity {

    private TextView eligeCol, selec;
    private Button azulBtn, lilaBtn, negroBtn, blancoBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

    azulBtn.findViewById(R.id.azulBtn);
    lilaBtn.findViewById(R.id.lilaBtn);
    negroBtn.findViewById(R.id.negroBtn);
    blancoBtn.findViewById(R.id.blancoBtn);

    }
}
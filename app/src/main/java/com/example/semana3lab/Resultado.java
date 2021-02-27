package com.example.semana3lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView nombResult, notaF;
    private Button calcuDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        String name = getIntent().getExtras().getString("name");
        String total = getIntent().getExtras().getString("total");


        nombResult = findViewById(R.id.nombResult);
        notaF = findViewById(R.id.notaF);
        calcuDN = findViewById(R.id.calcuDN);

        nombResult.setText(name);
        notaF.setText(total);



    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.calcuDN:



                Intent i = new Intent(this, calculoNota.class);
                i.putExtra("name", nombResult.getText().toString() );
                startActivityForResult(i,10);

                break;
        }
    }
}
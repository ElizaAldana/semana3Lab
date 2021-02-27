package com.example.semana3lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class calculoNota extends AppCompatActivity implements View.OnClickListener {

    private Button calcuBtn;
    private EditText proy1, proy2, quiz, parcial1, parcial2;
    private int  total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);

        calcuBtn = findViewById(R.id.calcuBtn);
        proy1 = findViewById(R.id.proy1);
        proy2 = findViewById(R.id.proy2);
        quiz = findViewById(R.id.quiz);
        parcial1 = findViewById(R.id.parcial1);
        parcial2 = findViewById(R.id.parcial2);

        calcuBtn.setOnClickListener(this);


    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.calcuBtn:

                String proy = proy1.getText().toString();
                String pro2 = proy2.getText().toString();
                String q = quiz.getText().toString();
                String par = parcial1.getText().toString();
                String par2 = parcial2.getText().toString();

                int i1 = Integer.parseInt(String.valueOf(proy1));
                int i2 = Integer.parseInt(String.valueOf(proy2));
                int i3 = Integer.parseInt(String.valueOf(quiz));
                int i4 = Integer.parseInt(String.valueOf(parcial1));
                int i5 = Integer.parseInt(String.valueOf(parcial2));

                total = (i1 + i2 + i3 + i4 + i5)/5;


                Intent i = new Intent(this, Resultado.class);
                i.putExtra("total", total);
                startActivityForResult(i,10);

                break;
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 10 && resultCode == RESULT_OK){
            String notaF = data.getExtras().getString("notaF");

        }
    }
}
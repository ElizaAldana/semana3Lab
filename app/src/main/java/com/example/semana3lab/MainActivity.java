package com.example.semana3lab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button contiBtn;
    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contiBtn = findViewById(R.id.contiBtn);
        nameText = findViewById(R.id.nameText);

        contiBtn.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.contiBtn:
                String name = contiBtn.getText().toString();

                Intent i = new Intent(this, calculoNota.class);
                i.putExtra("name", name);
                startActivityForResult(i,10);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 10 && resultCode == RESULT_OK){
            String nombResult = data.getExtras().getString("nombResult");
            nameText.setText(nombResult);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
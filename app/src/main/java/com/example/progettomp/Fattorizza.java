package com.example.progettomp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class Fattorizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        setContentView(R.layout.fattorizza);
    }

    protected void onResume(){
        super.onResume();

        String ret = getInstance().fattorizza();

        TextView out = findViewById(R.id.output);
        out.setText(ret);

    }
}

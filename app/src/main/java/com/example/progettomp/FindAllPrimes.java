package com.example.progettomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class FindAllPrimes extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        setContentView(R.layout.all_primes);
    }

    @Override
    protected void onResume(){
        super.onResume();

        int ret = getInstance().findAllPrimes();

        String s = "" + ret;
        TextView out = findViewById(R.id.output);
        out.setText(s);

    }
}


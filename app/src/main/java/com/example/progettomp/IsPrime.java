package com.example.progettomp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.progettomp.SingletonMyInput.getInstance;
import static com.example.progettomp.SingletonMyInput.isPrime;
import static com.example.progettomp.SingletonMyInput.setSingletonInstance;

public class IsPrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.is_prime_activity);
    }

    @Override
    protected void onResume(){
        super.onResume();

        boolean res;
        String text;

        res = isPrime(getInstance().myInput);
        if (res)
            text = "yes";
        else
            text = "no";
        TextView out = findViewById(R.id.output);
        out.setText(text);
    }

}
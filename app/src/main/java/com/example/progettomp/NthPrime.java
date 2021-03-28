package com.example.progettomp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class NthPrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nth_prime);
    }

    @Override
    protected void onResume(){
        super.onResume();

        int ret = getInstance().nesimoPrimo();

        String s = "" + ret;
        TextView out = findViewById(R.id.output);
        out.setText(s);
    }
}

package com.example.progettomp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class TwinPrimes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twin_prime);

    }

    @Override
    protected void onResume(){

        super.onResume();

        //controllo sul numero
        int n = getInstance().myInput;



        int[] ret = getInstance().primiGemelli();
        String s = "" + ret[0] + ", " + ret[1];
        TextView out = findViewById(R.id.output);
        out.setText(s);
    }

}

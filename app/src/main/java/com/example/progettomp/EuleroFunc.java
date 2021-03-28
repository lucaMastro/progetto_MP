package com.example.progettomp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class EuleroFunc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.eulero_func);
    }

    @Override
    protected void onResume(){
        super.onResume();

        int ret = getInstance().euleroFunc();
        String s = "" + ret;
        TextView out = findViewById(R.id.output);
        out.setText(s);
    }
}

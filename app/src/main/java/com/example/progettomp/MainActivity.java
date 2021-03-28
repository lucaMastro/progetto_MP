package com.example.progettomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import static com.example.progettomp.SingletonMyInput.getInstance;

public class MainActivity extends AppCompatActivity {


    /*verifica se il numero in input è 0*/
    protected static boolean checkForZero(){
        if (getInstance().myInput == 0)
            return true;
        else
            return false;
    }

    void creaToast(String text, boolean set_len) {
        /*crea un palloncino rosso con messaggio impostato uguale al parametro text. se set_len == false, allora la durata sarà lunga, altrimenti breve */
        Toast toast;
        if (set_len)
            toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
        else
            toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT);

        View view = toast.getView();
        view.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        toast.setGravity(toast.getGravity(), 0, 750);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        String s = "0";
        EditText editText = (EditText) findViewById(R.id.inputN);
        editText.setText(s);

    }

    @Override
    protected void onStart(){
        super.onStart();
/*        View progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);*/
    }


    @Override
    protected void onResume(){
        super.onResume();



        Button but0 = (Button) findViewById(R.id.isPrime);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else
                    runSubactivity(0);
            }
        });

        Button but1 = (Button) findViewById(R.id.findAllN);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else
                    runSubactivity(1);
            }
        });

        Button but2 = (Button) findViewById(R.id.fattorizzaInPrimi);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else
                    runSubactivity(2);
            }
        });

        Button but3 = (Button) findViewById(R.id.EuleroFunction);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else
                    runSubactivity(3);
            }
        });

        Button but4 = (Button) findViewById(R.id.trovaLaCoppiaN);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else {
                    if (n > 5000)
                        creaToast("Numero inserito troppo grande. Riprova con un numero minore di 5000", true);
                    else
                        runSubactivity(4);
                }

            }
        });

        Button but5 = (Button) findViewById(R.id.findTheNthPrime);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                EditText input = (EditText) findViewById(R.id.inputN);
                n = Integer.parseInt(input.getText().toString());
                SingletonMyInput.setSingletonInstance(n);

                if (checkForZero())//zero
                    creaToast("Inserisci un numero", false);
                else
                    runSubactivity(5);
            }
        });

    }


    @Override
    protected void onPause(){
        super.onPause();

        View progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onRestart(){
        super.onRestart();

        View progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.INVISIBLE);

    }

    public void runSubactivity(int code){
        Intent intent;



        switch (code){
            case 0:
                intent = new Intent(this, IsPrime.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, FindAllPrimes.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, Fattorizza.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, EuleroFunc.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, TwinPrimes.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, NthPrime.class);
                startActivity(intent);
                break;
        }
    }



}

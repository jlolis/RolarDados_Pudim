package com.example.joaoelolis.rolardados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado1;
    private ImageView imageViewDado2;
    private TextView textView;
    private int dado1;
    private int dado2;
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDado1 = findViewById(R.id.imageViewDado1);
        imageViewDado2 = findViewById(R.id.imageViewDado2);
        textView = findViewById(R.id.textView);
    }


    public void rolarDados(View view){

        criarNumAleatorio(imageViewDado1);
        criarNumAleatorio2(imageViewDado2);

        int resultado = dado1 + dado2 ;

        textView.setText(Integer.toString(resultado));

    }

    public void criarNumAleatorio(View view){

        Random random = new Random();
        int numAleatorio1 = (random.nextInt(6))+1;
        dado1 = numAleatorio1;

        if(numAleatorio1 == 1){
            imageViewDado1.setImageResource(R.drawable.dado1);
        }else if(numAleatorio1 == 2){
            imageViewDado1.setImageResource(R.drawable.dado2);
        }else if(numAleatorio1 == 3){
            imageViewDado1.setImageResource(R.drawable.dado3);
        }else if(numAleatorio1 == 4){
            imageViewDado1.setImageResource(R.drawable.dado4);
        }else if(numAleatorio1 == 5){
            imageViewDado1.setImageResource(R.drawable.dado5);
        }else if(numAleatorio1 == 6){
            imageViewDado1.setImageResource(R.drawable.dado6);
        }else{
            imageViewDado1.setImageResource(R.drawable.ic_launcher_background);
        }
    }

    public void criarNumAleatorio2(View view){

        Random random = new Random();
        int numAleatorio2 = (random.nextInt(6))+1;
        dado2 = numAleatorio2;

        if(numAleatorio2 == 1){
            imageViewDado2.setImageResource(R.drawable.dado1);
        }else if(numAleatorio2 == 2){
            imageViewDado2.setImageResource(R.drawable.dado2);
        }else if(numAleatorio2 == 3){
            imageViewDado2.setImageResource(R.drawable.dado3);
        }else if(numAleatorio2 == 4){
            imageViewDado2.setImageResource(R.drawable.dado4);
        }else if(numAleatorio2 == 5){
            imageViewDado2.setImageResource(R.drawable.dado5);
        }else if(numAleatorio2 == 6){
            imageViewDado2.setImageResource(R.drawable.dado6);
        }else{
            imageViewDado2.setImageResource(R.drawable.ic_launcher_background);
        }
    }

}

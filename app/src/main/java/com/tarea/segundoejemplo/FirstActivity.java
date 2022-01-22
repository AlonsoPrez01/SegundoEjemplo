package com.tarea.segundoejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    //Método para el botón Main Activity
    public void Main(View view1){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    //Método para el botón Segundo Activity
    public void SegundoA(View view2){
        Intent segundo = new Intent(this, SecondActivity.class);
        startActivity(segundo);
    }
}
package com.tarea.segundoejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para el botón Primer Activity
    public void Primer(View view1){
        Intent primer = new Intent(this, FirstActivity.class);
        startActivity(primer);
    }

    //Método para el botón Segundo Activity
    public void Segundo(View view2){
        Intent segundo = new Intent(this, SecondActivity.class);
        startActivity(segundo);
    }
}
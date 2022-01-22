package com.tarea.segundoejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //Método para el botón Main Activity
    public void irMain(View view1){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void irPrimer(View view2){
        Intent primer = new Intent(this, FirstActivity.class);
        startActivity(primer);
    }
}
package com.lock.fixie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarseActivity extends AppCompatActivity {

    TextView Registrarme;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        Registrarme = (TextView) findViewById(R.id.Registrarme);

        Registrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent I = new Intent(RegistrarseActivity.this, LoginActivity.class);
                startActivity(I);
            }
        });



    }
}

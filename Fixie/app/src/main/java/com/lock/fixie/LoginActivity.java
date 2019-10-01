package com.lock.fixie;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    TextView Login;
    TextView Registrarse;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Registrarse = (TextView) findViewById(R.id.Registrarse);

        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent I = new Intent(LoginActivity.this, RegistrarseActivity.class);
                startActivity(I);
            }
        });

        Login = (TextView) findViewById(R.id.ingresar);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent O = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(O);
            }
        });

    }
}

package com.lock.fixie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.lock.fixie.Fragments.MenuprincipalFragment;
import com.lock.fixie.Interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, MenuprincipalFragment.OnFragmentInteractionListener {

   Fragment fragmentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentInicio = new MenuprincipalFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void Imagenes() {
        Intent I = new Intent(MainActivity.this, ImagenesActivity.class);
        startActivity(I);

    }
    public void Registros() {
        Toast.makeText(getApplicationContext(), "Ver Registros", Toast.LENGTH_SHORT).show();

    }
    public void Perfil() {
        Toast.makeText(getApplicationContext(), "Ver Registros", Toast.LENGTH_SHORT).show();

    }
    public void Ajustes() {
        Toast.makeText(getApplicationContext(), "Ver Registros", Toast.LENGTH_SHORT).show();

    }

}

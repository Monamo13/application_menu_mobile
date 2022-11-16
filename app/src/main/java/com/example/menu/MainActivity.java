package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sousmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_sauvegarder:
                Toast.makeText(MainActivity.this, "L’item Sauvegarder est sélectionné", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_rechercher:
                Toast.makeText(MainActivity.this, "L’item Rechercher est sélectionné", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_preferences:
                Toast.makeText(MainActivity.this, "L’item Préférences est sélectionné", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_supprimer:
                Toast.makeText(MainActivity.this, "L’item Supprimer est sélectionné", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
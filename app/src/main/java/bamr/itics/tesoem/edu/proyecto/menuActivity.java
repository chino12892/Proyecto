package bamr.itics.tesoem.edu.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void moba(View v) {
        Intent l1 = new Intent(this,mobaActivity.class);
        startActivity(l1);
        finish();
    }
    public void aventura(View v) {
        Intent l2 = new Intent(this,AventuraActivity.class);
        startActivity(l2);
        finish();
    }
    public void shooter(View v) {
        Intent l3 = new Intent(this,ShooterActivity.class);
        startActivity(l3);
        finish();
    }
    public void estrategia(View v) {
        Intent l4 = new Intent(this,EstrategiaActivity.class);
        startActivity(l4);
        finish();
    }
    public void lucha(View v) {
        Intent l5 = new Intent(this,LuchaActivity.class);
        startActivity(l5);
        finish();
    }
    public void shorror(View v) {
        Intent l6 = new Intent(this,ShorrorActivity.class);
        startActivity(l6);
        finish();
    }
    public void plataformas(View v) {
        Intent l7 = new Intent(this,PlataformasActivity.class);
        startActivity(l7);
        finish();
    }
    public void rol(View v) {
        Intent l8 = new Intent(this,RolActivity.class);
        startActivity(l8);
        finish();
    }
    public void carreras(View v) {
        Intent l9 = new Intent(this,CarrerasActivity.class);
        startActivity(l9);
        finish();
    }
    public void nolineal(View v) {
        Intent l10 = new Intent(this,NolinealActivity.class);
        startActivity(l10);
        finish();
    }
}

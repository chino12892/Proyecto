package bamr.itics.tesoem.edu.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarrerasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreras);
    }
    public void menu(View v) {
        Intent menu = new Intent(this,menuActivity.class);
        startActivity(menu);
        finish();
    }
}

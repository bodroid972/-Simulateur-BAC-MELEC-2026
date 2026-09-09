package fr.melec.simulateurbac;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView texte = new TextView(this);
        texte.setText("Simulateur BAC MELEC 2026");
        texte.setTextSize(24);
        texte.setPadding(40, 80, 40, 40);

        setContentView(texte);
    }
}

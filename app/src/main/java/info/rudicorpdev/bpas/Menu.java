package info.rudicorpdev.bpas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button menu = findViewById(R.id.menu);
        Button tentang = findViewById(R.id.tentang);
        Button keluar = findViewById(R.id.keluar);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Bab.class));
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Tentang.class));
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keluar();
            }
        });

    }


    public void keluar() {
        new AlertDialog.Builder(this)
            .setMessage("Apa Anda ingin Keluar ?")
            .setCancelable(false)
            .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    Menu.this.finish();
                }
            })
            .setNegativeButton("Tidak", null)
            .show();
    }
}

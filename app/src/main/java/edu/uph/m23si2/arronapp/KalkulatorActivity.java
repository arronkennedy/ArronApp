package edu.uph.m23si2.arronapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {

    Button btnTambah, btnKali, btnBagi;

    EditText edtNilai1, edtNilai2;

    TextView txvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        edtNilai1 = findViewById(R.id.edtNilai1);
        edtNilai2 = findViewById(R.id.edtNilai2);
        txvHasil = findViewById(R.id.txvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil = nilai1 + nilai2;

                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil = nilai1 * nilai2;

                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil = nilai1 / nilai2;

                txvHasil.setText(String.valueOf(hasil));
            }
        });
    }

}
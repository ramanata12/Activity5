package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView Nama,NoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Nama = findViewById(R.id.tf_nama);
        NoHp = findViewById(R.id.tf_nohp);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Nata":
                Nama.setText("Ramadana Winata");
                NoHp.setText("08122223121");
                break;
            case "Janu":
                Nama.setText("Januar Rahmad");
                NoHp.setText("08122223122");
                break;
            case "Nayah":
                Nama.setText("Inayah Aridayanti");
                NoHp.setText("08122223123");
                break;
            case "Rahmat":
                Nama.setText("Rahmat Adi Setiawan");
                NoHp.setText("08122223124");
                break;
            case "Dayah":
                Nama.setText("Hidayah Apri Klananda");
                NoHp.setText("08122223125");
                break;

        }
    }
}
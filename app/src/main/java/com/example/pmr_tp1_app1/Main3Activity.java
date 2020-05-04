package com.example.pmr_tp1_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = this.getIntent().getExtras();
        String s = b.getString("pseudo");
        Toast t = Toast.makeText(this, "pseudo reçu" + s, Toast.LENGTH_SHORT);
        t.show();
    }
}

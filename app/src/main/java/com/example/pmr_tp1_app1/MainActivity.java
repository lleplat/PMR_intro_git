package com.example.pmr_tp1_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "trace";
    Button refBtnOK;
    EditText refEdtPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "onCreate");

        refBtnOK = findViewById(R.id.btnOK);
        refEdtPseudo = findViewById(R.id.edtPseudo);

        refBtnOK.setOnClickListener(this);
        refEdtPseudo.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        Toast t;
        switch(v.getId())
        {
            case R.id.btnOK :
                String s = refEdtPseudo.getText().toString();
                Log.i(TAG, "click sur bnt" + s);
                t = Toast.makeText(this, "click sur bnt", Toast.LENGTH_SHORT);
                t.show();

                Bundle b = new Bundle();
                b.putString("pseudo", s);

                Intent versA2 = new Intent(MainActivity.this, Main3Activity.class);
                versA2.putExtras(b);
                startActivity(versA2);

                break;


            case R.id.editText :
                Log.i(TAG, "click sur edt");
                t = Toast.makeText(this, "click sur edt", Toast.LENGTH_SHORT);
                t.show();
                break;
        }
    }
}

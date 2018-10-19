package com.example.amikom.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String nama;
    private String KEY_NAME = "NAMA";
    private TextView hello;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hello = (TextView) findViewById(R.id.hello);
        editText = findViewById(R.id.inputText);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        hello.setText("Hello, " + nama + " !");
    }
    public void toAct(View view) {
        Intent pindahAct = new Intent(MainActivity.this, pindahActivity.class);
        startActivity(pindahAct);
    }

    public void toFrg(View view) {
        Intent pindahFrg = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(pindahFrg);
    }

    public void addBtn(View view) {
        Intent addAct = new Intent(MainActivity.this, AddUserActivity.class);
        startActivity(addAct);
    }

    public void listBtn(View view) {
        Intent listAct = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(listAct);
    }
}

package com.example.amikom.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    preferenceshelper instance
            private EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = preferencehelper.getInstance(getApplicaionContext());

        nsme
    }
}

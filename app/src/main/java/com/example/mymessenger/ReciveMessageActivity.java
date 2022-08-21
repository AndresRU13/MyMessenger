package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReciveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);

        Intent intent = getIntent();
        String cadena = intent.getStringExtra(EXTRA_MESSAGE);
        TextView verCadena = (TextView)findViewById(R.id.message);
        verCadena.setText(cadena);
    }

    public void onSendMessage(View view) {

    }
}
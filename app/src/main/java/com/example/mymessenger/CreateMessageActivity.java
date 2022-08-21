package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText verCadena = (EditText)findViewById(R.id.message);
        String cadena = verCadena.getText().toString();

        Intent intent = new Intent(this, ReciveMessageActivity.class);
        intent.putExtra(ReciveMessageActivity.EXTRA_MESSAGE, cadena);
        startActivity(intent);
    }
}
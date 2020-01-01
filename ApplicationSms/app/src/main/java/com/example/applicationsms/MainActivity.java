package com.example.applicationsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button jump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jump = (Button) findViewById(R.id.Btn_sms);
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage_app();
            }
        });


    }

    public void openCall_app(View view) {
        Intent intent = new Intent(this, Call_app.class);
        startActivity(intent);
    }

    public void openMessage_app() {
        Intent intent = new Intent(this, Message_app.class);
        startActivity(intent);
    }

    public void openEmail_app(View view) {
        Intent email = new Intent(this,Email_app.class);
        startActivity(email);
    }
}

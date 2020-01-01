package com.example.applicationsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Email_app extends AppCompatActivity {


    public EditText mEmail;
    public EditText mSubject;
    public EditText mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_app);

        mEmail = (EditText)findViewById(R.id.txt_email);
        mMessage = (EditText)findViewById(R.id.txt_message);
        mSubject = (EditText)findViewById(R.id.txt_subject);

    }

    public void Send_email(View view) {
        String mail = mEmail.getText().toString().trim();
        String message = mMessage.getText().toString();
        String subject = mSubject.getText().toString().trim();

        //Send Mail
        MailAPI javaMailAPI = new MailAPI( this , mail , subject,message);

        javaMailAPI.execute();
    }
}

package com.example.msg;

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

        jump = (Button) findViewById(R.id.button);
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage_app();
            }
        });
    }
    public void openMessage_app() {
        Intent intent = new Intent(this,msg.class);
        startActivity(intent);
    }
    /*public void sendMsg(View v)
    {

        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setAction(Intent.ACTION_SENDTO);
       // sendIntent.putExtra(Intent.EXTRA_TEXT, "textMessage");
        //sendIntent.setType("text/plain");
        // Set the data for the intent as the phone number.
          sendIntent.setData(Uri.parse("smsto:03004511752"));

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        } else {
            Log.e("SMS_Sending", "Can't resolve app for ACTION_SEND Intent.");
        }
    }*/
}

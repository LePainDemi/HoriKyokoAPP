package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Context context = getApplicationContext();
        CharSequence text = "Hori Kyouko vous souhaite une bonne journée";
        int duration = Toast.LENGTH_SHORT;
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.rick);
        mPlayer.start();
        Toast.makeText(context, text, duration).show();
    }

    public void rick(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.rick);
        mPlayer.start();
    }

    Uri uri = Uri.parse("https://www.youtube.com/watch?v=XMCGhF48yUU&t=36s");
    public void horiCompil(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    };
}


package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<Integer, Integer> idToSound = new HashMap<>();
    MediaPlayer mediaPlayer;
    public void sayPhrase(View view){
        Button button = (Button) view;

        mediaPlayer = MediaPlayer.create(this, idToSound.get(button.getId()));


        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        idToSound.put(R.id.button1, R.raw.hello);
        idToSound.put(R.id.button2, R.raw.howareyou);
        idToSound.put(R.id.button3, R.raw.doyouspeakenglish);
        idToSound.put(R.id.button4, R.raw.goodevening);
        idToSound.put(R.id.button5, R.raw.please);
        idToSound.put(R.id.button6, R.raw.welcome);
        idToSound.put(R.id.button7, R.raw.ilivein);
        idToSound.put(R.id.button8, R.raw.mynameis);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
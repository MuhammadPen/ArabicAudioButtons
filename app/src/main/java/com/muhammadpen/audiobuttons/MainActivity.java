package com.muhammadpen.audiobuttons;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioPlayer;
    int id;

    public void buttonPressed (View view){

        id = view.getId();

        if(id == 2131165238 ){

       audioPlayer = MediaPlayer.create(this, R.raw.greetings);

       audioPlayer.start();

        }else if ( id == 2131165237){

            audioPlayer = MediaPlayer.create(this, R.raw.goodbye);

            audioPlayer.start();

        }else if ( id == 2131165243) {

            audioPlayer = MediaPlayer.create(this, R.raw.iamfine);

            audioPlayer.start();

        }else if ( id == 2131165242 ) {

            audioPlayer = MediaPlayer.create(this, R.raw.howareyou);

            audioPlayer.start();

        }else if (id == 2131165317 ) {

            audioPlayer = MediaPlayer.create(this, R.raw.whereareyougoing);

            audioPlayer.start();

        }else if (id == 2131165244 ) {

            audioPlayer = MediaPlayer.create(this, R.raw.iamgoingtowork);

            audioPlayer.start();

        }else {

            audioPlayer = MediaPlayer.create(this, R.raw.ilovetransparency);

            audioPlayer.start();

        }
        System.out.println(view.getId());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

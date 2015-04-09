package com.example.usuario.sound1;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    MediaPlayer mp = new MediaPlayer();
    ImageButton ibtn1, ibtn2, ibtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtn1 = (ImageButton) findViewById(R.id.imageButton);
        ibtn2 = (ImageButton) findViewById(R.id.imageButton2);
        ibtn3 = (ImageButton) findViewById(R.id.imageButton3);
    }

    public void onClickImgBtn1 (View view){
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.sound1);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

    }

    public void onClickImgBtn2 (View view){
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.sound2);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

    }

    public void onClickImgBtn3 (View view){
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.sound3);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.broadcastrececerex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;

public class MyBroadCastReciv extends BroadcastReceiver {
    MediaPlayer mp;
    private Context context;
    private AudioManager audioManager;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.alrm);
        mp.start();
    }
    public void makePhoneSilent(){
        audioManager=(AudioManager) context.getSystemService(context.AUDIO_SERVICE);
        audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
    }
}

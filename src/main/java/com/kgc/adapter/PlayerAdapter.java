package com.kgc.adapter;

/**
 * Created by jiang on 9/5/23 10:53 PM
 */
public class PlayerAdapter implements Music {

    private MyPlayer player;

    public PlayerAdapter() {
        this.player = new MyPlayer();
    }

    @Override
    public void play(String type, String filename) {
        if(type.equals("mp3")) this.player.playMp3(filename);
        if(type.equals("wma")) this.player.playWma(filename);
    }
}

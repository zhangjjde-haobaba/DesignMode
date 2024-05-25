package com.kgc.adapter;

/**
 * Created by jiang on 9/5/23 11:46 PM
 */
public class Test {
    public static void main(String[] args) {
        Music player = new PlayerAdapter();
        player.play("mp3","xxx.mp3");
        player.play("wma","yyy.wma");
    }
}

package org.example.HW20.task20_3_2;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setState(new StoppedState());

        mediaPlayer.addTrack("track1.mp3");
        mediaPlayer.addTrack("track2.mp3");
        mediaPlayer.addTrack("track3.mp3");

        mediaPlayer.play();
        mediaPlayer.next();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.next();
        mediaPlayer.next();
        mediaPlayer.prev();
        mediaPlayer.stop();
    }
}

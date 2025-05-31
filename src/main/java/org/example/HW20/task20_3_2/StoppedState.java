package org.example.HW20.task20_3_2;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Старт з початку: " + player.getCurrentTrack());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Не можу використати паузу плеєр зупинений.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Вже зупинено.");
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Не можу перейти до наступного треку тому що зупинений плеєр.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Не можу перейти до попереднього тому що зупинено.");
    }
}

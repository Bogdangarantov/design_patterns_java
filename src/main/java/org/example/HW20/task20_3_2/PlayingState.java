package org.example.HW20.task20_3_2;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Вже грає: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Зупинення треку: " + player.getCurrentTrack());
        player.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Зупинка відтворення.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        int newIndex = player.getCurrentTrackNum() + 1;
        if (newIndex < player.getTracks().size()) {
            player.setTrackNum(newIndex);
            System.out.println("Граємо наступний трек: " + player.getCurrentTrack());
        } else {
            System.out.println("Кінець плейлисту.");
        }
    }

    @Override
    public void prev(MediaPlayer player) {
        int newIndex = player.getCurrentTrackNum() - 1;
        if (newIndex >= 0) {
            player.setTrackNum(newIndex);
            System.out.println("Граю попередній трек: " + player.getCurrentTrack());
        } else {
            System.out.println("Початок плейлисту.");
        }
    }
}

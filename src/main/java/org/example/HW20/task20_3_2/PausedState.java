package org.example.HW20.task20_3_2;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Продовжуємо трек: " + player.getCurrentTrack());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Вже зупинимо.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Зупинено з паузи.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Не можу пропустити допоки пауза.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Не можу повернутись допоки пауза.");
    }
}

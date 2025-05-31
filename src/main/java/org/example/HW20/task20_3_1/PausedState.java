package org.example.HW20.task20_3_1;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("▶ Продовження відтворення.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("⏸ Вже на паузі.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("⏹ Зупинено з паузи.");
        player.setState(new StoppedState());
    }
}

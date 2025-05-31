package org.example.HW20.task20_3_1;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("🎵 Вже відтворюється.");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("⏸ Пауза.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("⏹ Зупинено.");
        player.setState(new StoppedState());
    }
}

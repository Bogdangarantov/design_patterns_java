package org.example.HW20.task20_3_1;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("▶ Початок відтворення.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("⚠ Не можна поставити на паузу — плеєр зупинено.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("⏹ Вже зупинено.");
    }
}

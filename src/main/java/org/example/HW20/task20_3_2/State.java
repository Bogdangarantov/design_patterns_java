package org.example.HW20.task20_3_2;

public interface State {
    void play(MediaPlayer player);
    void pause(MediaPlayer player);
    void stop(MediaPlayer player);
    void next(MediaPlayer player);
    void prev(MediaPlayer player);
}

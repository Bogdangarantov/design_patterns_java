package org.example.HW20.task20_3_1;

public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}

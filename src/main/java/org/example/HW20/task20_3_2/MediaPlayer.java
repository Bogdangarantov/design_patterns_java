package org.example.HW20.task20_3_2;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private State state;
    private final List<String> tracks = new ArrayList<>();
    private int currentTrackNum = 0;

    public void setState(State state) {
        this.state = state;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public List<String> getTracks() {
        return tracks;
    }

    public String getCurrentTrack() {
        if (tracks.isEmpty()) return "Немає Треків";
        return tracks.get(currentTrackNum);
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public void setTrackNum(int i) {
        if (i >= 0 && i < tracks.size()) currentTrackNum = i;
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

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }
}

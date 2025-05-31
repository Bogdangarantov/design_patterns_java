package org.example.HW20.task20_3_3;

public class Fan {

    private State state;

    public Fan() {
        this.state = new LowState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp();
    }

    public void turnDown() {
        state.turnDown();
    }
}

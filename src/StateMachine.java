public class StateMachine<C> {
    private State<C> currentState;

    public void changeState(State<C> newState) {
        if (currentState != null) {
            currentState.leave();
        }
        currentState = newState;
        currentState.enter();
    }

    public void update() {
        if (currentState != null) {
            currentState.execute();
        }
    }
}

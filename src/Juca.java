public class Juca {
    private int Hunger = 0;
    private int Fatigue = 0;
    private StateMachine<Juca> stateMachine;

    public void sleep(int mimir, int fome) {
        Fatigue -= mimir;
        Hunger += fome;
    }

    public void getTired(int mimir) {
        Fatigue += mimir;
    }

    public int getFatigue() {
        return Fatigue;
    }

    public void eat(int food) {
        Hunger -= food;
    }

    public void starve(int food) {
        Hunger += food;
    }

    public int getHunger() {
        return Hunger;
    }

    public Juca() {
        stateMachine = new StateMachine<>();
    }

    public void update() {
        System.out.println("Juca está com " + Hunger + " de fome e " + Fatigue + " de fadiga.");
        stateMachine.update();
    }

    public void setState(State<Juca> newState) {
        stateMachine.changeState(newState);
    }

}

public class Juca {
    private int Hunger = 0;
    private int Fatigue = 0;
    private StateMachine<Juca> stateMachine;

    // Menções do Bob
    private Bob bob;

    public Juca(Bob bob) {
        this.bob = bob;
        stateMachine = new StateMachine<>();
    }

    public Bob getBob() {
        return bob;
    }

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

    public void update() {
        stateMachine.update();
        System.out.println("Juca está com " + Hunger + " de fome e " + Fatigue + " de fadiga.");
    }

    public void setState(State<Juca> newState) {
        stateMachine.changeState(newState);
    }

}

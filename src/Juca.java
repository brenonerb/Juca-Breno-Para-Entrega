public class Juca {
    private int Hunger = 0;
    private int Fatigue = 0;
    private State state = new Working();

    public void DoAction() {
        state.DoAction(this);
        System.out.println("Estou com " + Hunger + " de fome e " + Fatigue + " de cansaço.");
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

    public void setState(State new_state) {
        state = new_state;
    }

}

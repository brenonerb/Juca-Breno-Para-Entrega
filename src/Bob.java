public class Bob {
    private int FoodAtHome = 0;
    private int FilthAtHome = 0;
    private StateMachine<Bob> stateMachine;

    public Bob() {
        stateMachine = new StateMachine<>();
    }

    public void Clean(int sujeira) {
        FilthAtHome -= sujeira;
    }

    public void MakeAMess() {
        FilthAtHome = 25;
    }

    public int getFilthAtHome() {
        return FilthAtHome;
    }

    public void cook(int food) {
        FoodAtHome += food;
    }

    public void eatFood(int food) {
        FoodAtHome -= food;
    }

    public int getFoodAtHome() {
        return FoodAtHome;
    }

    public void update() {
        stateMachine.update();
        System.out.println("Bob está com " + FoodAtHome + " de comida e " + FilthAtHome + " de sujeira na casa.");
    }

    public void setState(State<Bob> newState) {
        stateMachine.changeState(newState);
    }

}

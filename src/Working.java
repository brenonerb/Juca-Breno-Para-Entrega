public class Working implements State {
    public void DoAction(Juca juca) {
        System.out.println("Trabalhando...");
        juca.starve(2);
        juca.getTired(5);
        if (juca.getFatigue() > 50) juca.setState(new Sleeping());
        else if (juca.getHunger() > 10) juca.setState(new Eating());
    }
}
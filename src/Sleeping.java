public class Sleeping implements State {
    public void DoAction(Juca juca) {
        System.out.println("Dormindo...");
        juca.sleep(10, 1);
        if (juca.getFatigue() < 0) {
            juca.sleep(juca.getFatigue(), 0);
            juca.setState(new Working());
        }
    }
}

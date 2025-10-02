public class Eating implements State {
    public void DoAction(Juca juca) {
        System.out.println("Comendo...");
        juca.eat(5);
        if (juca.getHunger() <= 0) {
            if (juca.getHunger() < 0) juca.eat(juca.getHunger());
            juca.setState(new Working());
        }
    }
}

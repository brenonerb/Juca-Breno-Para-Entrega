public class Eating extends AbstractState<Juca> {
    private Bob bob;
    public Eating(Juca character) {
        super(character);
    }

    public void enter() {
        System.out.println("Juca começou a comer.");
    }

    public void execute() {
        System.out.println("Juca está comendo...");
        character.eat(5);
        character.getBob().eatFood(1);
        if (character.getHunger() <= 0) {
            if (character.getHunger() < 0) character.eat(character.getHunger());
            character.setState(new Working(character));
        }
    }

    public void leave() {
        System.out.println("Juca parou de comer. Ele fez uma sujeira!");
        character.getBob().MakeAMess();
    }
}

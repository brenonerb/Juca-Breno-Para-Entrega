public class Working extends AbstractState<Juca> {
    public Working(Juca character) {
        super(character);
    }

    public void enter() {
        System.out.println("Juca começou a trabalhar.");
    }

    public void execute() {
        System.out.println("Juca está trabalhando...");
        character.starve(2);
        character.getTired(5);
        if (character.getFatigue() > 50) character.setState(new Sleeping(character));
        else if (character.getHunger() > 10) character.setState(new Eating(character));
    }

    public void leave() {
        System.out.println("Juca parou de trabalhar.");
    }
}

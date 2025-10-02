public class Sleeping extends AbstractState<Juca> {
    public Sleeping(Juca character) {
        super(character);
    }

    public void enter() {
        System.out.println("Juca começou a dormir.");
    }

    public void execute() {
        System.out.println("Dormindo...");
        character.sleep(10, 1);
        if (character.getFatigue() < 0) {
            character.sleep(character.getFatigue(), 0);
            character.setState(new Working(character));
        }
    }

    public void leave() {
        System.out.println("Juca parou de dormir. Bom dia!");
    }
}

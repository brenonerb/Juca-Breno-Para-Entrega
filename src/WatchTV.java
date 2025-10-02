public class WatchTV extends AbstractState<Bob> {
    public WatchTV(Bob character) {
        super(character);
    }

    public void enter() {
        System.out.println("Bob não tem mais o que fazer. Hora de ver TV!");
    }

    public void execute() {
        System.out.println("Bob está assistindo TV...");
        if (character.getFoodAtHome() < 10) character.setState(new Cooking(character));
        if (character.getFilthAtHome() != 0) {
            if (character.getFoodAtHome() < 10) character.setState(new Cooking(character));
            else character.setState(new Cleaning(character));
        }

    }

    public void leave() {
        System.out.println("Bob desligou a TV. Hora de trabalhar!");
    }
}

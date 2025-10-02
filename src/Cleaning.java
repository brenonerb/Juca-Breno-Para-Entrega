public class Cleaning extends AbstractState<Bob> {
    public Cleaning(Bob character) {
        super(character);
    }

    public void enter() {
        System.out.println("Bob começou a limpar a casa.");
    }

    public void execute() {
        System.out.println("Bob está limpando...");
        character.Clean(5);
        if (character.getFilthAtHome() <= 0) {
            character.Clean(character.getFilthAtHome());
            if (character.getFoodAtHome() > 10) character.setState(new WatchTV(character));
            else character.setState(new Cooking(character));
        }
    }

    public void leave() {
        System.out.println("Bob parou de limpar a casa. Ela ficou limpinha!");
    }
}

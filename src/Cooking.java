public class Cooking extends AbstractState<Bob> {
    public Cooking(Bob character) {
        super(character);
    }

    public void enter() {
        System.out.println("Hora do Bob fazer comida!");
    }

    public void execute() {
        System.out.println("Bob está cozinhando...");
        character.cook(2);
        if (character.getFoodAtHome() >= 10) {
            if (character.getFilthAtHome() > 0) character.setState(new Cleaning(character));
            else character.setState(new WatchTV(character));
        }
    }

    public void leave() {
        System.out.println("Bob parou de cozinhar. Já tem comida o bastante em casa!");
    }
}

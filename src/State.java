public interface State<C> {
    C getCharacter();
    void enter();
    void execute();
    void leave();
}

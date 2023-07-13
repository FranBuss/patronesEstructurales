// Decorador abstracto
public abstract class CharacterDecorator implements Character{

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public void dibujar() {
        character.dibujar();
    }
}

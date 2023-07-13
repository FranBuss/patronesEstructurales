// Decorador concreto: armadura
public class ArmorDecorator extends CharacterDecorator {
    public ArmorDecorator(Character character) {
        super(character);
    }

    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("Equipar armadura");
    }
}

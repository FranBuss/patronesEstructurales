//Decorador concreto: Arma
public class WeaponDecorator extends CharacterDecorator{

    public WeaponDecorator(Character character) {
        super(character);
    }

    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("Equipar arma");
    }
}

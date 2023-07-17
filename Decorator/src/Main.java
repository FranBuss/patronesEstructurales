public class Main {
    public static void main(String[] args) {
//        // Crear personaje principal
//        Character player = new PlayerCharacter();
//
//        // Decorar el personaje con arma
//        Character playerWithWeapon = new WeaponDecorator(player);
//
//        // Decorar el personaje con armadura
//        Character playerWithWeaponAndArmor = new ArmorDecorator(playerWithWeapon);
//
//        // Dibujar el personaje con todas las decoraciones
//        playerWithWeaponAndArmor.dibujar();

        Character player = new ArmorDecorator(new WeaponDecorator(new PlayerCharacter()));
        player.dibujar();

    }
}
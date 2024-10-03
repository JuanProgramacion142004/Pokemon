package autonoma.models;


/**
 * @author Juan David Arcila Restrepo
 * @fecha 10/01/2024
 */


public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5, "Primera");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanzallamas");
    }
}

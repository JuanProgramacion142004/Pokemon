package autonoma.models;



/**
 * @author Juan David Arcila Restrepo
 * @fecha 10/01/2024
 */


public class Pikachu extends Pokemon implements PokemonElectrico {
    public Pikachu() {
        super(25, "Pikachu", 6.0, "Primera");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo Carga");
    }
}

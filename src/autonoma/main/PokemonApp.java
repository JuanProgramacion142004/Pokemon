package autonoma.main;

import autonoma.models.Bulbasaur;
import autonoma.models.Charmander;
import autonoma.models.Pikachu;
import autonoma.models.Squirtle;

/**
 * @author Juan David Arcila Restrepo
 * @fecha 10/01/2024
 */

public class PokemonApp {
    public static void main(String[] args){
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

//Charmander
        charmander.atacarPlacaje();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();

//Bulbasaur
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarLatigoCepa();

//Squirtle
        squirtle.atacarPlacaje();
        squirtle.atacarHidrobomba();
        squirtle.atacarPistolaAgua();

//Pikachu
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        pikachu.atacarRayoCarga();
    }
}

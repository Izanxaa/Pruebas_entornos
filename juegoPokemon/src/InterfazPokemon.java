import java.util.Scanner;
public class InterfazPokemon {
    private Scanner teclado;

    public InterfazPokemon(){
        teclado = new Scanner(System.in);
    }

    public void Juego() {
        System.out.println("");
        Pokemon jugador = menuCreacionPokemonJugador();

        for (int i = 1; i <= 3; i++) {
            Pokemon rival = siguientePokemonRival(i);
            System.out.println("¡Te enfrentas a " + rival + "!");

            Pokemon ganador = partida(jugador, rival);
            if (ganador == jugador) {
                jugador.subirNivel();
                System.out.println("Has ganado el combate, subiste de nivel");
            } else {
                mostrarFinPartida();
                return;
            }
        }
        mostrarJuegoSuperado();
    }

    private Pokemon Partida(Pokemon pokemonJugador, Pokemon pokemonRival){
        Combate combate = new Combate(pokemonJugador, pokemonRival);
        while (combate.Ganador() == null) {
            combate.Ronda();
        }
        return combate.Ganador();
    }


    private Pokemon menuCreacionPokemonJugador(){


    }

    public Pokemon siguientePokemonRival(int numero) {


    }

    private void mostrarJuegoSuperado(){
        System.out.println("++++++++++ ENHORABUENA +++++++++++");
        System.out.println("+++++ HAS SUPERADO EL JUEGO ++++++");
        System.out.println("++++ ERES UN MAESTRO POKEMON +++++");
    }

    private void mostrarFinPartida(){
        System.out.println("++++++++++ LO SIENTO +++++++++++");
        System.out.println("+++++ HAS SIDO ELIMINADO ++++++");
        System.out.println("+++++ VUELVE A INTENTARLO +++++");
    }

}

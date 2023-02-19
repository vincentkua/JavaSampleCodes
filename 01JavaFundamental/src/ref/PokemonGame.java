package ref;

import java.io.Console;

public class PokemonGame {

    public static void main(String[] arg) {
        Console cons = System.console();

        Poketrainer player = new Poketrainer();
        Pokemon wildpokemon = new Pokemon(10, "Pikachu", "male", 45, 10, 5);

        System.out.println("Hi Player your team is" + player.getTeam());
        System.out.println("Encounter Wild Pokemon " + wildpokemon.getName() + "!!!");

        while (true) {
            System.out.printf("%s(%s) level:%d hp:%d/%d \n", wildpokemon.getName(), wildpokemon.getSex(),
                    wildpokemon.getLevel(), wildpokemon.getRemainhp(), wildpokemon.getMaxhp());
            String usercommand = cons.readLine("What you would like to do ? (Attack / Run)");

            if (usercommand.equals("Attack")) {
                wildpokemon.hit(12);
            } else if (usercommand.equals("Run")) {
                System.out.println("Ok Run Away Successfully... You Are So Useless...");
                break;
            }

            if (wildpokemon.getRemainhp() <= 0) {
                wildpokemon.setRemainhp(0);
                System.out.printf("%s(%s) level:%d hp:%d/%d \n", wildpokemon.getName(), wildpokemon.getSex(),
                        wildpokemon.getLevel(), wildpokemon.getRemainhp(), wildpokemon.getMaxhp());
                System.out.println("Congrat !!! You Win!!! The Pokemon was fainted!!! How Cruel You are...");
                break;
            }
        }

    }

}

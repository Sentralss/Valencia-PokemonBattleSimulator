import java.util.Scanner;
public class PokemonBattleSimulatorRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);



        System.out.println("\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓\nWelcome to the Pokemon Battle Simulator!\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓" +
                "\n             _" +
                "\n _ __   ___ | | _____ _ __ ___   ___  _ __" +
                "\n| '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ " +
                "\n| |_) | (_) |   <  __/ | | | | | (_) | | | |" +
                "\n| .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|" +
                "\n|_|\n" +
                "\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        System.out.print("\nAre you a new or returning player? (Type n for new or r for returning) ");
        String returning = scan.nextLine();
        System.out.println("\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.print("\nWhat game mode do you want to play? (1v1, 2v2, or 3v3): " );
        String gameMode = scan.nextLine();
        System.out.print("Playing " + gameMode + "...\n" );
        System.out.println("\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println("Pick your Pokemon/Team (Can't pick the same Pokemon twice)\n\nVenasaur   Charizard   Blastoise   Snorlax   Picahcu   Alakazam \n" +
                "Grass      Fire        Water       Normal    Electric  Psychic\n" +
                "\n" +
                "Lucario   Golem   Garchomp   Pidgetto   Scizor   Nidoking\n" +
                "Fighting  Rock    Ground     Flying     Bug      Poison\n" +
                "\n" +
                "Umbreon   Gengar   Walrein   Metagross   Dragonite   Gardevoir\n" +
                "Dark      Ghost    Ice       Steel       Dragon      Fairy");
        System.out.println("\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");










    }
}

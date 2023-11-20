import java.util.Scanner;
public class PokemonBattleSimulatorRunner
{
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Reset = "\u001b[0m";
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("""

                ◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓
                Welcome to the Pokemon Battle Simulator!
                ◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓
                             _
                 _ __   ___ | | _____ _ __ ___   ___  _ __
                | '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\
                | |_) | (_) |   <  __/ | | | | | (_) | | | |
                | .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|
                |_|

                ◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓""");

        System.out.print("Are you a new or returning player? (Type n for new or r for returning) ");
        String returning = scan.nextLine();
        System.out.println("◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.print("What game mode do you want to play? (1v1, 2v2, or 3v3): ");
        String gameMode = scan.nextLine();
        System.out.print("Playing " + gameMode + "...\n" );
        System.out.println("◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println("""
                Pick your Pokemon/Team (Can't pick the same Pokemon twice)

                Venasaur   Charizard   Blastoise   Snorlax   Pikachu   Alakazam
                Grass      Fire        Water       Normal    Electric  Psychic

                Lucario   Golem   Garchomp   Pidgetto   Scizor   Nidoking
                Fighting  Rock    Ground     Flying     Bug      Poison

                Umbreon   Gengar   Walrein   Metagross   Dragonite   Gardevoir
                Dark      Ghost    Ice       Steel       Dragon      Fairy
                
                Your pick/s (Pick1, Pick2, Pick3):""");
        String pokemon = scan.nextLine();
        System.out.println("◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
    }
}

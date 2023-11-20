import java.util.Scanner;
public class PokemonBattleSimulatorRunner
{
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String BlueBright = "\033[0;94m";
    static String White = "\u001b[37m";
    static String RedBright = "\033[0;91m";
    static String PurpleBright = "\033[0;95m";
    static String CyanBright = "\033[0;96m";
    static String GreenBright = "\033[0;92m";
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
        System.out.println("Pick your Pokemon/Team (Can't pick the same Pokemon twice)");
        System.out.println(Green +"Venasaur   "+ Red +"Charizard   "+ Blue +"Blastoise   "+ Reset +"Snorlax   "+ Yellow +"Pikachu");
        System.out.println(Green +"Grass      "+ Red +"Fire        "+ Blue +"Water       "+ Reset +"Normal    "+ Yellow +"Electric\n");
        System.out.println(RedBright+"Lucario   "+ GreenBright +"Scizor   "+ Magenta +"Nidoking   "+ Black +"Umbreon   "+ PurpleBright +"Gengar");
        System.out.println(RedBright+"Fighting  "+ GreenBright +"Bug      "+ Magenta +"Poison     "+ Black +"Dark      "+ PurpleBright +"Ghost\n");
        System.out.println(CyanBright+"Walrein   "+ White +"Metagross   "+ BlueBright +"Dragonite   ");
        System.out.println(CyanBright+"Ice       "+ White +"Steel       "+ BlueBright +"Dragon    \n");
        System.out.println(Reset + "Your pick/s (Pick1, Pick2, Pick3)");
        String pokemon = scan.nextLine();
        System.out.println("◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
    }
}

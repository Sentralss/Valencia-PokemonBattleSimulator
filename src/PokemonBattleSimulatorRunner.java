import java.util.Scanner;
public class PokemonBattleSimulatorRunner
{
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String BlueBright = "\033[0;94m";
    static String White = "\u001b[37m";
    static String RedBright = "\033[0;91m";
    static String PurpleBright = "\033[0;95m";
    static String CyanBright = "\033[0;96m";
    static String GreenBright = "\033[0;92m";
    static String Yellow = "\033[0;93m";
    static String Reset = "\u001b[0m";

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println(Red +"\n◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println(Reset +"Welcome to the Pokemon Battle Simulator!");
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        System.out.println(Red+"             _\n _ __   ___ | | _____ _ __ ___   ___  _ __\n| '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\\n" + Black +"| |_) | (_) |   <  __/ | | | | | (_) | | | |\n" + Reset +"| .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|\n|_|\n");


        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println(Reset + "Pick your Pokemon/Team (Can't pick the same Pokemon twice)");
        System.out.println(Green +"Venasaur   "+ Red +"Charizard   "+ Blue +"Blastoise   "+ Reset +"Snorlax   "+ Yellow +"Pikachu");
        System.out.println(Green +"Grass      "+ Red +"Fire        "+ Blue +"Water       "+ Reset +"Normal    "+ Yellow +"Electric\n");

        System.out.println(RedBright+"Lucario   "+ GreenBright +"Scizor   "+ Magenta +"Nidoking   "+ Black +"Umbreon   "+ PurpleBright +"Gengar");
        System.out.println(RedBright+"Fighting  "+ GreenBright +"Bug      "+ Magenta +"Poison     "+ Black +"Dark      "+ PurpleBright +"Ghost\n");

        System.out.println(CyanBright+"Walrein   "+ White +"Metagross   "+ BlueBright +"Dragonite   ");
        System.out.println(CyanBright+"Ice       "+ White +"Steel       "+ BlueBright +"Dragon    \n");

        System.out.println(Reset + "Your pick/s (Pick1, Pick2, Pick3) (This will also determine the order they come out in):");
        String choice = Reset + scan.nextLine();
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        PokemonBattleSimulator newGame = new PokemonBattleSimulator("Charizard", "Fire", 50, 100, 80, 70);

        System.out.println(Reset + "Starting Game...");
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println(Reset + "Computers team: " + Reset + newGame.comPick());
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        System.out.println(Reset + "Choose a move to use against the opponents pokemon:");
        String move = scan.nextLine();

        PokemonBattleSimulator bulbasaur = new PokemonBattleSimulator("Bulbasaur", "Grass", 50, 100, 70, 80);
        // Calculate and print the damage
        int damageToOpponent = newGame.calculateDamage();
        PokemonBattleSimulator yourPokemon = new PokemonBattleSimulator("Charizard", "Fire", 50, 100, 80, 70);
        yourPokemon.battle();



        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
    }
}

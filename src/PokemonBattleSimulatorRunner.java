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
        System.out.println(Reset + "Pick your Pokemon:");
        System.out.println(Green +"Venasaur   "+ Red +"Charizard   "+ Blue +"Blastoise   "+ Reset +"Snorlax   "+ Yellow +"Pikachu");
        System.out.println(Green +"Grass      "+ Red +"Fire        "+ Blue +"Water       "+ Reset +"Normal    "+ Yellow +"Electric\n");

        System.out.println(RedBright+"Lucario   "+ GreenBright +"Scizor   "+ Magenta +"Nidoking   "+ Black +"Umbreon   "+ PurpleBright +"Gengar");
        System.out.println(RedBright+"Fighting  "+ GreenBright +"Bug      "+ Magenta +"Poison     "+ Black +"Dark      "+ PurpleBright +"Ghost\n");

        System.out.println(CyanBright+"Walrein   "+ White +"Metagross   "+ BlueBright +"Dragonite   ");
        System.out.println(CyanBright+"Ice       "+ White +"Steel       "+ BlueBright +"Dragon    \n");

        System.out.println(Reset + "Your pick:");
        String choice = Reset + scan.nextLine();
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        PokemonBattleSimulator opponents = new PokemonBattleSimulator("Venasaur", "Grass", 50, 300, 70, 80);
        PokemonBattleSimulator yourPokemon = new PokemonBattleSimulator("Charizard", "Fire", 50, 300, 80, 70);

        if(choice.equalsIgnoreCase("charizard")){
            yourPokemon = new PokemonBattleSimulator("Charizard", "Fire", 50, 500, 80, 70);
        }else if (choice.equalsIgnoreCase("venasaur")) {
            yourPokemon = new PokemonBattleSimulator("Venasaur", "Grass", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("blastoise")) {
            yourPokemon = new PokemonBattleSimulator("Blastoise", "Water", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("pikachu")) {
            yourPokemon = new PokemonBattleSimulator("Pikachu", "Electric", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("snorlax")) {
            yourPokemon = new PokemonBattleSimulator("Snorlax", "Normal", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("lucario")) {
            yourPokemon = new PokemonBattleSimulator("Lucario", "Fighting", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("scizor")) {
            yourPokemon = new PokemonBattleSimulator("Scizor", "Bug", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("nidoking")) {
            yourPokemon = new PokemonBattleSimulator("Nidoking", "Poison", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("umbreon")) {
            yourPokemon = new PokemonBattleSimulator("Umbreon", "Dark", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("gengar")) {
            yourPokemon = new PokemonBattleSimulator("Gengar", "Ghost", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("Walrein")) {
            yourPokemon = new PokemonBattleSimulator("Walrein", "Ice", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("Metagross")) {
            yourPokemon = new PokemonBattleSimulator("Metagross", "Steel", 50, 500, 80, 70);
            yourPokemon.battle();
        } else if (choice.equalsIgnoreCase("Dragonite")) {
            yourPokemon = new PokemonBattleSimulator("Dragonite", "Dragon", 50, 500, 80, 70);
            yourPokemon.battle();
        }
        int damageToOpponent = yourPokemon.calculateDamage();
        yourPokemon.battle();





        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
    }
}

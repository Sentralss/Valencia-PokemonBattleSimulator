
public class PokemonBattleSimulator
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
    private String pokemon;
    private String gameMode;


    public PokemonBattleSimulator(String pokemon, String gameMode)
    {
        this.pokemon = pokemon;
        this.gameMode = gameMode;
    }

    public void GameHud(String pokemon) {
        if (pokemon.equals("venasaur")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|                    |                    |\n|                    |                    |\n -------------------- --------------------\n|                    |                    |\n|                    |                    |\n -------------------- --------------------");
        }
    }



}

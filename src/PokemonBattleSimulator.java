
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
        if (pokemon.equalsIgnoreCase("venasaur")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("charizard")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("blastoise")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("snorlax")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("pikachu")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("lucario")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("scizor")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("nidoking")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("umbreon")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("genegar")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("walrein")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("metagross")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------");
        } else if(pokemon.equalsIgnoreCase("dragonite")) {
            System.out.println(Reset + "Moves:\n -------------------- --------------------\n|                    |                    |\n|                    |                    |\n -------------------- --------------------\n|                    |                    |\n|                    |                    |\n -------------------- --------------------");
        }

    }

    public String comPick()
    {
        int pick = (int)(Math.random()* 13 + 1);
        pokemon = "";
        if(pick == 1){
            pokemon = Green + "Venasaur";
        }
        else if(pick == 2){
            pokemon = Red + "Charizard";
        }
        else if(pick == 3){
            pokemon = Blue + "Blastoise";
        }
        else if(pick == 4){
            pokemon = Reset + "Snorlax";
        }
        else if(pick == 5){
            pokemon = Yellow + "Pikachu";
        }
        else if(pick == 6){
            pokemon = RedBright + "Lucario";
        }
        else if(pick == 7){
            pokemon = GreenBright + "Scizor";
        }
        else if(pick == 8){
            pokemon = Magenta + "Nidoking";
        }
        else if(pick == 9){
            pokemon = Black + "Umbreon";
        }
        else if(pick == 10){
            pokemon = PurpleBright +"Gengar";
        }
        else if(pick == 11){
            pokemon = CyanBright + "Walrein";
        }
        else if(pick == 12){
            pokemon = White +"Metagross";
        }
        else if(pick == 13){
            pokemon = BlueBright + "Dragonite";
        }
        return pokemon;
    }

    public void damage()
    {

    }

}

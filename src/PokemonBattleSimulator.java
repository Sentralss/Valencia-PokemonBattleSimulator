import java.util.Random;

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
    private String type;
    private int level;
    private int health;
    private int attack;
    private int defense;


    public PokemonBattleSimulator(String pokemon, String type, int level, int health, int attack, int defense) {
        this.pokemon = pokemon;
        this.type = type;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }


    public int calculateDamage(opponent) {
        Random random = new Random();
        double damageMultiplier = random.nextDouble() * 0.5 + 0.75;

        // Calculate damage using the basic formula (for simplicity)
        int damage = (int) (((2.0 * level / 5 + 2) * attack / opponent.getDefense()) / 50 + 2) * opponent.typeMultiplier(this.type);

        // Apply the random factor
        damage = (int) (damage * damageMultiplier);

        return damage;
    }


    private double typeMultiplier(String opponentType) {
        if (this.type.equals("Fire") && (opponentType.equals("Grass") || opponentType.equals("Bug"))) {
            return 2.0; // Double damage
        } else if (this.type.equals("Water") && (opponentType.equals("Fire") || opponentType.equals("Rock"))) {
            return 2.0; // Double damage
        } else if (this.type.equals("Grass") && (opponentType.equals("Water") || opponentType.equals("Electric"))) {
            return 2.0; // Double damage
        } else {
            return 1.0; // Normal damage
        }
    }
    public String GameHud(String poke) {
        String moveSet = "Unknown Pokémon: " + poke;

        if (poke.equalsIgnoreCase("venasaur")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("charizard")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Fire ball           |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("blastoise")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Water Gun           |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("snorlax")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Tackle              |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("pikachu")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Electric Shock      |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("lucario")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Low Sweep           |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("scizor")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Razor Leaf          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("nidoking")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Prick               |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("umbreon")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Bite                |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("gengar")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Shadow Ball         |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("walrein")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Icicle              |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("metagross")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Steel Toss          |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        } else if (poke.equalsIgnoreCase("dragonite")) {
            moveSet = "Moves:\n -------------------- --------------------\n|Dragon Dance        |Body Slam           |\n|Damage:55           |Damage:85          |\n -------------------- --------------------\n|Sludge Bomb         |Vine Whip           |\n|Damage:90           |Damage:45          |\n -------------------- --------------------";
        }

        return Reset + moveSet;
    }

    public void battle(opponent) {
        System.out.println("Battle between " + this.getName() + " and " + opponent.getName());

        while (this.getHealth() > 0 && opponent.getHealth() > 0) {

            int damageToOpponent = this.calculateDamage(opponent);
            int damageToSelf = opponent.calculateDamage(this);

            opponent.reduceHealth(damageToOpponent);
            this.reduceHealth(damageToSelf);

            System.out.println(this.pokemon() + " deals " + damageToOpponent + " damage to " + opponent.pokemon());
            System.out.println(opponent.pokemon() + " deals " + damageToSelf + " damage to " + this.pokemon());

            System.out.println(this.pokemon() + "'s health: " + this.getHealth());
            System.out.println(opponent.pokemon() + "'s health: " + opponent.getHealth());
        }

        if (this.getHealth() <= 0) {
            System.out.println(this.pokemon() + " fainted. " + opponent.pokemon() + " wins!");
        } else {
            System.out.println(opponent.pokemon() + " fainted. " + this.pokemon() + " wins!");
        }
    }

    // Method to reduce health
    private void reduceHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
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

    public String pokemon() {
        return pokemon;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }


}

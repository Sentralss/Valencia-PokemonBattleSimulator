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


    public int calculateDamage() {
        Random random = new Random();
        double damageMultiplier = random.nextDouble() * 0.5 + 0.75;

        int opponentDefense = 50;

        double typeMultiplier = 1.0;

        // Calculate damage using the basic formula (for simplicity)
        int damage = (int) (((2.0 * level / 5 + 2) * attack / opponentDefense) / 50 + 2) * (int) (typeMultiplier * 10);

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

    // Method to reduce health
    private void reduceHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public void battle() {
        Random random = new Random();
        int opponentHealth = 100; // Replace with actual opponent health
        int damageToOpponent;

        System.out.println("Battle between your Pokemon and a randomly picked opponent!");

        while (health > 0 && opponentHealth > 0) {
            damageToOpponent = calculateDamage();
            opponentHealth -= damageToOpponent;

            System.out.println("Your Pokemon deals " + damageToOpponent + " damage to the opponent.");
            System.out.println("Opponent's health: " + opponentHealth);

            if (opponentHealth <= 0) {
                System.out.println("Opponent fainted. Your Pokemon wins!");
            } else {
                // Simulate opponent's attack (replace with actual logic)
                int damageToYou = random.nextInt(10) + 1;
                health -= damageToYou;

                System.out.println("Opponent deals " + damageToYou + " damage to your Pokemon.");
                System.out.println("Your Pokemon's health: " + health);

                if (health <= 0) {
                    System.out.println("Your Pokemon fainted. Opponent wins!");
                }
            }
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

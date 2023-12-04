import java.util.Random;
import java.util.Scanner;
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
    Scanner scan = new Scanner(System.in);
    public PokemonBattleSimulator(String pokemon, String type, int level, int health, int attack, int defense) {
        this.pokemon = pokemon;
        this.type = type;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }


    public int calculateDamage()
    {
        Random random = new Random();
        double damageMultiplier = random.nextDouble() * 0.5 + 0.75;

        int opponentDefense = 50;

        double typeMultiplier = 1.0;

        int damage = (int) (((2.0 * level / 5 + 2) * attack / opponentDefense) / 50 + 2) * (int) (typeMultiplier * 10);

        damage = (int) (damage * damageMultiplier);

        return damage;
    }


    private double typeMultiplier(String opponentType)
    {
        if (this.type.equals("Fire") && (opponentType.equals("Grass") || opponentType.equals("Bug") || (opponentType.equals("Ice") || opponentType.equals("Steel")))) {
            return 2.0;
        } else if (this.type.equals("Water") && (opponentType.equals("Fire") || opponentType.equals("Rock"))) {
            return 2.0;
        } else if (this.type.equals("Grass") && (opponentType.equals("Water") || opponentType.equals("Electric"))) {
            return 2.0;
        } else if (this.type.equals("Normal")) {
            return 1.0;
        } else if (this.type.equals("Electric") && (opponentType.equals("Water"))) {
            return 2.0;
        } else if (this.type.equals("Fighting") && (opponentType.equals("Dark") || opponentType.equals("Steel")||(opponentType.equals("Normal") || opponentType.equals("Ice")))) {
            return 2.0;
        } else if (this.type.equals("Bug") && (opponentType.equals("Grass") || opponentType.equals("Dark"))) {
            return 2.0;
        } else if (this.type.equals("Poison") && (opponentType.equals("Grass"))) {
            return 2.0;
        } else if (this.type.equals("Dark") && (opponentType.equals("Ghost"))) {
            return 2.0;
        } else if (this.type.equals("Ghost")) {
            return 1.0;
        } else if (this.type.equals("Ice") && (opponentType.equals("Dragon") || opponentType.equals("Grass"))) {
            return 2.0;
        } else if (this.type.equals("Steel") && (opponentType.equals("Ice"))) {
            return 2.0;
        } else if (this.type.equals("Dragon") && (opponentType.equals("Dragon"))) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    public void battle()
    {
        Random random = new Random();
        int opponentHealth = 300;
        int damageToOpponent;
        String comPoke = comPick();

        System.out.println(Reset + "Starting Game...");
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");
        System.out.println(Reset + "Computers team: " + Reset + comPoke);
        System.out.println(Red +"◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓◓");

        System.out.println(Reset + "Choose a move to use against the opponents pokemon:");
        String move = scan.nextLine();

        System.out.println("\nBattle between your Pokemon and "+ comPoke + Reset + "!\n");

        while (health > 0 && opponentHealth > 0) {
            damageToOpponent = calculateDamage();
            opponentHealth -= damageToOpponent;

            System.out.println("Your Pokemon deals " + damageToOpponent + " damage to the opponent.");
            System.out.println("Opponent's health: " + opponentHealth);

            if (opponentHealth <= 0) {
                System.out.println("Opponent fainted. Your Pokemon wins!");
            } else {
                int damageToYou = random.nextInt(10) + 1;
                health -= damageToYou;

                System.out.println(Reset + "\nChoose a move to use against the opponents pokemon:");
                move = scan.nextLine();
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

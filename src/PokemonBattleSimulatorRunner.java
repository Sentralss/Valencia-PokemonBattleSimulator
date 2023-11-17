import java.util.Scanner;
public class PokemonBattleSimulatorRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the Pokemon Battle Simulator!");
        System.out.println("\n" +
                "────────▄███████████▄────────\n" +
                "─────▄███▓▓▓▓▓▓▓▓▓▓▓███▄─────\n" +
                "────███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███────\n" +
                "───██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██───\n" +
                "──██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██──\n" +
                "─██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██─\n" +
                "██▓▓▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓██\n" +
                "██▓▓▓▓▓▓▓▓██░░░░░██▓▓▓▓▓▓▓▓██\n" +
                "██▓▓▓▓▓▓▓██░░███░░██▓▓▓▓▓▓▓██\n" +
                "███████████░░███░░██████████\n" +
                "██░░░░░░░██░░███░░██░░░░░░░██\n" +
                "██░░░░░░░░██░░░░░██░░░░░░░░██\n" +
                "██░░░░░░░░░███████░░░░░░░░░██\n" +
                "─██░░░░░░░░░░░░░░░░░░░░░░░██─\n" +
                "──██░░░░░░░░░░░░░░░░░░░░░██──\n" +
                "───██░░░░░░░░░░░░░░░░░░░██───\n" +
                "────███░░░░░░░░░░░░░░░███────\n" +
                "─────▀███░░░░░░░░░░░███▀─────\n" +
                "────────▀███████████▀────────");
        System.out.print("\nAre you a new or returning player? ");
        String returning = scan.nextLine();
        System.out.print("What game mode do you want to play? (1v1, 2v2, or 3v3): " );
        String gameMode = scan.nextLine();










    }
}

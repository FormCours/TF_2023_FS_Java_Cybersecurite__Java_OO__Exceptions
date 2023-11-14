import exceptions.NegativeNumberArgumentException;
import helpers.RandomHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez encoder les valeurs suivantes : ");
        System.out.print(" - Min  : ");
        int min = sc.nextInt();
        System.out.print(" - Max  : ");
        int max = sc.nextInt();
        System.out.print(" - Step : ");
        int step = sc.nextInt();

        try {
            // ↓ Ce code peut planter !!!
            int result = RandomHelper.getInteger(min, max, step);

            System.out.println("La valeur aléatoire encodée est " + result + " !");
        }
        catch (NegativeNumberArgumentException ex) {
            System.out.println("Step Negatif (╯°□°）╯︵ ┻━┻");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }
        finally {
            // Ce code sera TOUJOURS executé !
            System.out.println("Fin de la démo =)");
        }
    }
}
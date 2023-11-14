package helpers;

import exceptions.NegativeNumberArgumentException;

import java.util.Random;

public class RandomHelper {

    private RandomHelper() {}

    private final static Random rng = new Random();

    /***
     * Permet de générer un nombre aleatoire avec un pas
     * @param min Valeur minimum (incluse)
     * @param max Valeur maximum (excluse)
     * @param step Valeur du pas
     * @return Le nombre aleatoire
     */
    public static int getInteger(int min, int max, int step) {
        // Test → Exception si valeur incorrect !
        //          min 20, max 2, step 5
        //          min 0, max 100, step 0
        if(min >= max) {
            throw new IllegalArgumentException("Le minimum doit être inférieur au maximum");
        }
        if(step <= 0) {
            throw  new NegativeNumberArgumentException("Le \"step\" doit être un entier positive");
        }

        // Exemple : Generation de nombre aleatoire de 7 à 20 par pas de 3
        // Valeur possible → 7, 10, 13, 16, 19

        // Nb Possibilité 5 →  (20-7)/3 = 4.3333 ~ 5
        //                     (20-5)/3 = 5
        int nbPossibility = (int)Math.ceil((max-min)/(double)step);

        // Valeur rng → 0 .. 4
        int rngValue = rng.nextInt(nbPossibility);

        // Calcul de la valeur final
        // Exemple en ayant obtenu la valeur 2 →  7 + (3 * 2) = 13
        return min + (rngValue * step);
    }

}

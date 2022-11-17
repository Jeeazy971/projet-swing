package taquin;

import taquin.vue.Vue;
import taquin.vue.console.VueConsole;
import taquin.vue.swing.VueSwing;

/**
 * Jeu du taquin (sliding puzzle).
 *
 * Présentation du jeu : https://fr.wikipedia.org/wiki/Taquin
 *
 * @author Josué BAYIDIKILA | Romain QUISSAC | Erwin MAITRET
 */
public class JeuDuTaquin {

    /** Dimension unique pour faciliter la génération d'un damier carré. */
    private final static int DIMENSION_DAMIER = 3;
    private final static int NB_GLISSEMENTS = 50;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vue vue;

        if (args.length >= 1 && args[0].equals("--show"))
            vue = new VueSwing();
        else
            vue = new VueConsole();

        ControleurJeu jeu = new ControleurJeu(DIMENSION_DAMIER, DIMENSION_DAMIER, vue);

        jeu.demarrerPartie(NB_GLISSEMENTS);
    }

}
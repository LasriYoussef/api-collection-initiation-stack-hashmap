package fr.afpa;

import java.util.EmptyStackException;
// Le package java.util.Stack est importé pour utiliser la classe Stack, qui implémente une pile basée sur le principe LIFO (Last In, First Out)
import java.util.Stack;

//Le point d'entrée du programme est la méthode main, qui contient le code pour démontrer les fonctionnalités de la pile
public class LawWorkerCheckerStack {

    /**
     * Vérifie si les types de travail dans une chaîne sont des travaux juridiques.
     * 
     * @param lawTypeWorker La chaîne de caractères à traiter
     * @return VRAI si tous les types de travail dans la chaîne sont juridiques,
     *         FAUX sinon
     */
    public static boolean workCheck(String lawTypeWorker) throws EmptyStackException {
        // Création d'une nouvelle pile
        Stack<String> stack = new Stack<String>();

        // Définir les types de travail légaux
        // La pile est utilisée pour stocker les types de travail juridiques trouvés
        // dans la chaîne.
        // Les types de travail juridiques sont définis dans un tableau legalJobs.
        String[] legalJobs = { "Lawyer", "Judge", "Paralegal", "Legal Assistant" };

        // Séparer les mots de la chaîne de caractères
        String[] works = lawTypeWorker.split(",\\s*");
        try {
            // Parcourir le type de travail à traiter
            for (String work : works) {
                // Vérifier si le mot est un type de travail juridique et l'ajouter à la pile
                for (String job : legalJobs) {
                    if (job.equals(work)) {
                        stack.push(work);
                        break;
                    }
                }
            }
        } catch (EmptyStackException exception) {
            // Afficher un message pour gérer les erreurs
            System.out.println(exception.getMessage());
        }

        // Retourner vrai si la pile n'est pas vide (au moins un travail juridique
        // trouvé)
        return !stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "Lawyer, Judge";
        String test2 = "Doctor, Engineer";
        String test3 = "Lawyer, Paralegal, Judge";
        String test4 = "Lawyer, Judge, Legal Assistant";

        System.out.println("Test 1: " + workCheck(test1)); // devrait retourner vrai
        System.out.println("Test 2: " + workCheck(test2)); // devrait retourner faux
        System.out.println("Test 3: " + workCheck(test3)); // devrait retourner faux
        System.out.println("Test 4: " + workCheck(test4)); // devrait retourner vrai
    }
}

// ----------------------------------------------------------------------------------------------

// Autre methode de pile (stack)

// import java.util.Stack;
// //Le point d'entrée du programme est la méthode main, qui contient le code
// pour démontrer les fonctionnalités de la pile
// public class LawWorkerCheckerStack {
// public static void main(String[] args) {

// // Instanciation d'une nouvelle objet Stack(Pile) qui contient des éléments
// de type String
// Stack<String> stack = new Stack<String>();

// // Les éléments sont ajoutés à la pile. La méthode (push) ajoute un élément
// en haut de la pile
// stack.push("Paralegal");
// stack.push("Judge");
// stack.push("Legal Assisatnt");

// // Ajoutez une valeur au début de la stack
// stack.addFirst("Lawyer");
// // Affichez votre stack
// System.out.println("Voici les éléments de notre Stack: " + stack);

// // Supprimez l'élément du dessus de votre stack
// System.out.println("Suppression de l'élément du dessus");
// stack.pop();

// // Affichez l'élément du dessus de votre stack
// System.out.println("Affichage de l'élément du dessus: " + stack.peek());

// // Supprimez le premier élément de votre stack
// System.out.println("Suppression du premier élément");
// stack.removeLast();

// // Affichez le premier élément de votre stack
// System.out.println("Affichage du premier élément: " + stack.getFirst());

// // Cherchez et affichez la position d'un de vos éléments (la valeur indiquera
// la position de l'élément par rapport au dessus de la stack)
// System.out.println("L'élément est en " + stack.search("Blue") + "eme position
// par rapport au dessus de la Stack");

// // Vérifiez si votre stack est vide
// System.out.println("La Stack est vide?: " + stack.isEmpty());

// // Supprimez tous les éléments de votre stack
// System.out.println("Suppression de tous les élements de notre Stack");
// stack.clear();

// // Refaires la vérification
// System.out.println("La Stack est vide? :" + stack.isEmpty());

// }
// }
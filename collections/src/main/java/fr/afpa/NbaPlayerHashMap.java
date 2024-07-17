package fr.afpa;

// Faites l'import de java HashMap
import java.util.HashMap;

public class NbaPlayerHashMap {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5

        // Instanciez une nouvelle HashMap sur le theme de votre choix
        HashMap<String, String> bestTeamPlayer = new HashMap<String, String>();

        // Ajoutez des paires clé/valeur à votre HashMap - au moins 5 paires
        bestTeamPlayer.put("Lakers", "Lebron James");
        bestTeamPlayer.put("Celtics", "Jason Tatum");
        bestTeamPlayer.put("Golden States", "Stephan Cury");
        bestTeamPlayer.put("Clippers", "Paul Georges");
        bestTeamPlayer.put("Heat", "Jimmy Butler");

        // Récupérez la valeur d'une de vos paires
        System.out.println("La valeur récupérée est: " + bestTeamPlayer.get("Golden States"));

        // Vérifiez si une de vos clés est contenue dans la collection
        System.out.println("La clé en paramètre est présente: " + bestTeamPlayer.containsKey("Heat"));

        // Vérifiez si une de vos valeurs est contenue dans la collection
        System.out.println("La valeur en paramètre est présente: " + bestTeamPlayer.containsValue("Lebron James"));

        // Ajoutez une paire clé/valeur à votre HashMap
        System.out.println("Ajout d'une nouvelle paire clé/valeur");
        bestTeamPlayer.put("Mavericks", "Kyrie Irving");

        // Utilisez une méthode pour trouver le nombre de paires (la longueur de
        // votre HashMap) et affichez la en console
        System.out.println("Nombre de paires clé/valeur: " + bestTeamPlayer.size());

        // Affichez toutes les clés de votre HashMap (avec une boucle for each & avec
        // une méthode de HashMap)
        System.out.println("Voici les clés de notre HashMap: ");
        for (String i : bestTeamPlayer.keySet()) {
            System.out.println(i);
        }

        System.out.println(bestTeamPlayer.keySet());

        // Affichez toutes les valeurs de votre HashMap (avec une boucle for each & avec
        // une méthode de HashMap)
        System.out.println("Voici les valeurs de notre HashMap: ");
        for (String i : bestTeamPlayer.values()) {
            System.out.println(i);
        }

        System.out.println(bestTeamPlayer.values());

        // Affichez toutes les clés/valeurs de votre HashMap (avec une boucle for each &
        // avec une méthode de HashMap)
        System.out.println("Voici les paires de notre HashMap: ");
        for (String i : bestTeamPlayer.keySet()) {
            System.out.println("key: " + i + " value: " + bestTeamPlayer.get(i));
        }

        System.out.println(bestTeamPlayer.entrySet());

        // Supprimez une de vos paires
        System.out.println("Suppression d'une de nos paires");
        bestTeamPlayer.remove("Heat");

        // Vérifiez si votre HashMap est vide
        System.out.println("La Hashmap est vide? :" + bestTeamPlayer.isEmpty());

        // Supprimez tous les éléments de votre HashMap
        System.out.println("Suppression de tous les élements de notre HashMap");
        bestTeamPlayer.clear();

        // Refaires la vérification
        System.out.println("La Hashmap est vide? :" + bestTeamPlayer.isEmpty());

    }
}

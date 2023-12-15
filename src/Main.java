import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Chiamata alla funzione per creare e riempire l'HashSet
        HashSet<String> hashSet = creaRiempiHashet();

        // Chiamata alla funzione per leggere e stampare l'HashSet0
        leggiEStampaHashset(hashSet);
    }

    public static HashSet<String> creaRiempiHashet() {
        HashSet<String> hashSet = new HashSet<>();

        // Aggiungi elementi all'HashSet
        hashSet.add("elemento1");
        hashSet.add("elemento2");

        return hashSet;
    }

    public static void leggiEStampaHashset(HashSet<String> hashSet) {
        // Stampa la grandezza dell'HashSet
        System.out.println("Dimensione dell'HashSet = " + hashSet.size());

        // Stampa gli elementi dell'HashSet
        System.out.println("Questi sono gli elementi dell'hashet :");
        for (String elemento : hashSet) {
            System.out.println(elemento);
        }
    }
}

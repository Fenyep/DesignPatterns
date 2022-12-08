import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // First instance creation
        Singleton s1 = Singleton.getInstance("me");
        // Verification of the instance value
        s1.afficher();

        // Second creation of the instance, but the value shouldn't change
        Singleton s2 = Singleton.getInstance("peer");
        // erification of the instance
        s2.afficher();
    }
}
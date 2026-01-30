package World_1;

/**
 * Main class
 */
public class Main{
    /**
     * Main method
     * @param args the string of arguments
     */
    public static void main(String[] args){
        Player a = new Player("Alice");
        Player b = new Player("Bob");

        a.display();
        b.display();

        a.updateScore(50);
        b.updateScore(-25);

        a.display();
        b.display();

        System.out.println("");

        System.out.println(a.toString());
        System.out.println(b.toString());

        System.out.println("");

        //Tests .equals(Objet)
        System.out.println("Player Alice égal à \"Alice\" : " + a.equals("Alice"));
        System.out.println("Player Alice égal à joueur Bob : " + a.equals(b));
        Player b1 = new Player("BOB");
        System.out.println("Player bob égal à new BOB : " + b.equals(b1));
        System.out.println("Player Bob == new BOB : " + (b == b1));
        Player b2 = b;
        System.out.println("Player Bob == new b2 : " + (b == b2));

        System.out.println("");

        // Number of players created
        System.out.println("Number of players created : " + Player.getNbPlayer());

        //Deleting a player
        b = null;
        b2 = null;

        // New players
        Player j1 = new Player();
        Player j2 = new Player();

        j1.display();
        j2.display();
    }
}

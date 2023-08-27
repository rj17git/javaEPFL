import java.util.Scanner;

class Swap3 {
	private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez la premiere  valeur : ");
        int a = keyboard.nextInt();

        System.out.print("Entrez la deuxieme  valeur : ");
        int b = keyboard.nextInt();

        System.out.print("Entrez la troisieme valeur : ");
        int c = keyboard.nextInt();

        System.out.println("Les valeurs entrees sont : a = " + a
                           + ", b = " + b + " et c = " + c);

        System.out.println("Permutation: a ==> b, b ==> c, c ==> a");

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int temp;
        temp = a;
        a = c;
        c = b;
        b = temp;


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        System.out.println("Les valeurs permutees sont : a = " + a
                           + ", b = " + b + " et c = " + c);
    }
}
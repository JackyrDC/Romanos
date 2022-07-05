import java.util.Scanner;


public class Romanos {

    public static void main(String[] args) {
        int m;
        Scanner teclado = new Scanner(System.in);
        String unidad[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
        String decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String miles = "";

        System.out.print("Ingrese un numero entre 1 y 3999 que desea conviertir a romanos: ");
        int n = teclado.nextInt();
        int resto = n;
        m = resto / 1000; //3950/1000=3
        resto = resto % 1000;  //950

        int c = resto / 100; //9
        resto = resto % 100; // 50

        int d = resto / 10; //5
        resto = resto % 10; // 0

        int u = resto;
        for (int i = 1; i <= m; i++) {
            miles += "M";
        }
        if (n >= 1000) {
            System.out.println(miles + centena[c] + decena[d] + unidad[u]);
        } else if (n >= 100) {
            System.out.println(centena[c] + decena[d] + unidad[u]);
        } else {
            if (n >= 10) {
                System.out.println(decena[d] + unidad[u]);
            } else {
                System.out.println(unidad[n]);
            }
        }
    }
}
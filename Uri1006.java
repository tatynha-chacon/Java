import java.util.Scanner;
public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float a, b, c;
        double d;
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = ((2 * a) + (3 * b) + (5 * c)) / 10;
        System.out.printf("MEDIA = %.1f%n",d);
    }
}
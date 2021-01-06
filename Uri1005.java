import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float a, b;
        double c;
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = ((3.5 * a) + (7.5 * b)) / 11;
        System.out.printf("MEDIA = %.5f%n",c);
    }
}
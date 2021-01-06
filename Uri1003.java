import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = a + b;
        System.out.println("SOMA = " + c);
    }
}
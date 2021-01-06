import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, num, cont;
        n = teclado.nextInt();
        cont = 1;
        while (cont<= n) {
            num = teclado.nextInt();
            if (num == 0){
            System.out.println ("NULL");
            }
            else {
                if (num % 2 == 0){
                    System.out.print ("EVEN ");
                }
                else {
                    System.out.print ("ODD ");
                }
                if (num > 0){
                    System.out.println ("POSITIVE");
                }
                else if (num < 0){
                    System.out.println ("NEGATIVE");
            }
            }
            cont = cont + 1;
        }
    }
}
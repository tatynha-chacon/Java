import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        num = teclado.nextFloat();
        if (num >= 0.0 && num <= 25.0){
            System.out.println ("Intervalo [0,25]");
        }
        else if (num > 25.0 && num <=50.0){
            System.out.println ("Intervalo (25,50]");
        }
        else if (num > 50.0 && num <=75.0){
            System.out.println ("Intervalo (50,75]");
        }
        else if (num > 75.0 && num <=100.0){
            System.out.println ("Intervalo (75,100]");
        } 
        else System.out.println ("Fora de Intervalo");             
    }
}
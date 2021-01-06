import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, notaUm;
        valor = teclado.nextInt();
        notaCem = valor / 100;
        notaCinquenta = (valor % 100) / 50;
        notaVinte = (valor % 100) % 50 / 20;
        notaDez = (((valor % 100) % 50) % 20) / 10;
        notaCinco = ((((valor % 100) % 50) % 20) % 10) / 5;
        notaDois = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        notaUm = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2);
        System.out.println (valor);
        System.out.println (notaCem + " nota(s) de R$ 100,00");
        System.out.println (notaCinquenta + " nota(s) de R$ 50,00");
        System.out.println (notaVinte + " nota(s) de R$ 20,00");
        System.out.println (notaDez + " nota(s) de R$ 10,00");
        System.out.println (notaCinco + " nota(s) de R$ 5,00");
        System.out.println (notaDois + " nota(s) de R$ 2,00");
        System.out.println (notaUm + " nota(s) de R$ 1,00");
    }
}
import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int percentual;
        double salario, reajuste, novoSalario;
        salario = teclado.nextDouble();
        if (salario >= 0.00 && salario <= 400.00){
            percentual = 15;
        }
        else if (salario >= 401.00 && salario <= 800.00){
            percentual = 12;
        }
        else if (salario >= 801.00 && salario <= 1200.00){
            percentual = 10;
        }
        else if (salario >=1201.00 && salario <= 2000.00){
            percentual = 7;
        } 
        else {
            percentual = 4;
        }
        reajuste = salario * percentual / 100;
        System.out.printf ("Novo salario: %.2f%n", salario + reajuste);
        System.out.printf ("Reajuste ganho: %.2f%n", reajuste);
        System.out.println ("Em percentual: " + percentual + " %");
    }
}
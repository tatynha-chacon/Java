import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numFunc, horas;
        float valorHora, salario;
        numFunc = teclado.nextInt();
        horas = teclado.nextInt();
        valorHora = teclado.nextFloat();
        salario = (horas*valorHora);
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
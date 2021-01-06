import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num,soma;
        int qtde;
        soma = 0;
        qtde = 0;
        for (int cont=1;cont<=6;cont++){
            num = teclado.nextFloat();
            if (num >= 0){
                qtde++;
                soma = soma + num;
                }
            }   
            System.out.println(qtde + " valores positivos");
            System.out.printf("%.1f\n", (soma/qtde));
    }
} 
import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, qtdeNumPar;
        qtdeNumPar = 0;
        for (int cont=1;cont<=5;cont++){
            num = teclado.nextInt();
            if (num % 2 == 0){
                qtdeNumPar++;
                }
            }   
            System.out.println(qtdeNumPar + " valores pares");
    }
} 
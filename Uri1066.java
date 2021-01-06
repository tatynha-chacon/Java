import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, qtdeNumPar, qtdeNumImp, qtdeNumPos, qtdeNumNeg;
        qtdeNumPar = 0;
        qtdeNumImp = 0;
        qtdeNumPos = 0;
        qtdeNumNeg = 0;
        for (int cont=1;cont<=5;cont++){
            num = teclado.nextInt();
            if (num % 2 == 0){
                qtdeNumPar++;
                }
            else qtdeNumImp++;
            if (num > 0){
                qtdeNumPos++;
                }
            else if (num < 0){
                qtdeNumNeg ++;
                }
            }   
            System.out.println(qtdeNumPar + " valor(es) par(es)");
            System.out.println(qtdeNumImp + " valor(es) impar(es)");
            System.out.println(qtdeNumPos + " valor(es) positivo(s)");
            System.out.println(qtdeNumNeg + " valor(es) negativo(s)");
    }
}
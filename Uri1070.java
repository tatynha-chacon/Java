import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, numAux;
        num = teclado.nextInt();
        if (num % 2 == 0){
            numAux = num + 1;
            }
            else numAux = num;
            for (int cont=1;cont<=6;cont++){
            System.out.println(numAux);
            numAux = numAux +2;}
    }
}
import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


                    int num, limite, numPar;
        numPar = 2;
        num = teclado.nextInt();

        if (num % 2 != 0){
            limite = num - 1;
            }
            else limite = num;
        do{
            System.out.println(numPar + "^2 = " + (numPar*numPar));
            numPar = numPar + 2;
            } while (numPar <= limite);
    }
}
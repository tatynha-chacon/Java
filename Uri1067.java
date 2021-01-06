import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, limite, numImp;
        numImp = 1;
        num = teclado.nextInt();
        if (num % 2 == 0){
            limite = num - 1;
            }
            else limite = num;
        do{
            System.out.println(numImp);
            numImp = numImp +2;
            } while (numImp <= limite);
    }
}
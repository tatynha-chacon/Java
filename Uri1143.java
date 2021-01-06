import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, pos1, pos2, pos3;
        pos1 = 1;
        n = teclado.nextInt();
        for (int cont=1; cont<=n;cont++){
            pos2 = pos1*pos1;
            pos3 = pos2*pos1;
            System.out.println (pos1+ " "+ pos2 + " " + pos3);
            pos1++;
        }
    }
}
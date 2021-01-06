import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, pos1, pos2, pos3;
        String pos4;
        pos1 = 1;
        pos2 = 2;
        pos3 = 3;
        pos4 = "PUM";
        n = teclado.nextInt();
        for (int cont=1; cont<=n;cont++){
            System.out.println (pos1+ " "+pos2 + " "+pos3 + " "+pos4);
            pos1 = pos1 + 4;
            pos2 = pos2 + 4;
            pos3 = pos3 + 4;
        }
    }
}
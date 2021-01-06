import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, pos1, pos2, pos3, pos4, pos5, limite, cont;
        n = teclado.nextInt();
        limite = n*2;
        cont = 1;
        pos1 = 1;
        pos2 = 1;
        pos3 = 1;
        pos4 = 1;
        pos5 = 1;
        do {
            /*if (cont == 1){
                System.out.println (pos1+ " "+ pos2 + " " + pos3);
                pos2 = pos2 + 1;
                pos3 = pos3 + 1;
                pos1 = pos1 +1;
            }
            else{
            */ 
            pos4 = pos2 + 1;
            pos5 = pos3 +1; 
            System.out.println (pos1+ " "+ pos2 + " " + pos3);
            cont = cont +1;
            System.out.println (pos1+ " "+ pos4 + " " + pos5);
            pos1 = pos1 +1;
            pos2 = pos1*2;
            pos3 = pos2*2;
            
           
            cont = cont +1;
        } while (cont <= limite);
    }
}
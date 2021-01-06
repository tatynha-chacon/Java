import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao, contOpcao1, contOpcao2, contOpcao3, contOpcao4;
        contOpcao1 = 0;
        contOpcao2 = 0;
        contOpcao3 = 0;
        contOpcao1 = 0;
        do {
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                contOpcao1 ++;
                break;
                case 2:
                contOpcao2 ++;
                break;
                case 3:
                contOpcao3 ++;
                break;
                case 4:
                break;
            }
        } while (opcao !=4);
            System.out.println ("MUITO OBRIGADO");
            System.out.println ("Alcool: "+ contOpcao1);
            System.out.println ("Gasolina: "+ contOpcao2);
            System.out.println ("Diesel: "+ contOpcao3);
    }            
}
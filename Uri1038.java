import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        double valor, valorCodUm, valorCodDois, valorCodTres, valorCodQuatro, valorCodCinco;
        valorCodUm = 4.0;
        valorCodDois = 4.5;
        valorCodTres = 5.0; 
        valorCodQuatro = 2.0;
        valorCodCinco = 1.5;
        cod = teclado.nextInt();
        qtde = teclado.nextInt();
        if (cod == 1){
            valor = qtde * valorCodUm;
            System.out.printf ("Total: R$ %.2f%n", valor);
            }
            else if (cod == 2){
                valor = qtde * valorCodDois;
                System.out.printf ("Total: R$ %.2f%n", valor);
                }
                else if (cod == 3){
                    valor = qtde * valorCodTres;
                    System.out.printf ("Total: R$ %.2f%n", valor);
                    }
                    else if (cod == 4){
                        valor = qtde * valorCodQuatro;
                        System.out.printf ("Total: R$ %.2f%n", valor);
                        } 
                        else if (cod ==5){
                            valor = qtde * valorCodCinco;
                            System.out.printf ("Total: R$ %.2f%n", valor);
                            }
                            else System.out.printf ("Codigo Invalido");
    }
}
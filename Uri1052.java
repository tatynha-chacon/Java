import java.util.Scanner;
public class Uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codMes;
        codMes = teclado.nextInt();
        if (codMes == 1){
            System.out.println ("January");
        }
        else if (codMes == 2){
            System.out.println ("February");
                }
                else if (codMes == 3){
                    System.out.println ("March");
                    }
                    else if (codMes == 4){
                        System.out.println ("April");
                        } 
                        else if (codMes == 5){
                            System.out.println ("May");
                            }
                            else if (codMes == 6){
                                System.out.println ("June");
                                }
                                else if (codMes == 7){
                                    System.out.println ("July");
                                    }
                                    else if (codMes == 8){
                                        System.out.println ("August");
                                        }
                                        else if (codMes == 9){
                                            System.out.println ("September");
                                            }
                                            else if (codMes == 10){
                                                System.out.println ("October");
                                                }
                                                else if (codMes == 11){
                                                    System.out.println ("November");
                                                    }
                                                    else System.out.println ("December");
    }
}
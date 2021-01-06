import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInicio, minutoFim, horaFim, minutoFim;
        horaInicio = teclado.nextDouble();
        minutoFim = teclado.nextDouble();
        horaFim = teclado.nextDouble();
        minutoFim = teclado.nextDouble();
        qtdeMin
        
        totalMinInicio = horaInicio * 60 + minutoInicio;
        totalMinFim = horaFim * 60 + minutoFim;
        totalMin = totalMinFim - totalMinInicio;
        if (totalMin <= 0){
            totalMin = totalMin + 1440;
        }
        qtdeHora = totalMin / 60;
        qtdeMin = totalMin % 60;

        System.out.println ("O jogo durou" +qtdeHora + qtdeMin);
    }
}
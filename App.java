import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

       System.out.println ("Quantos metros deseja converter em centimetros");
       double metros = sc.nextDouble();

       //calcular a medida em centímetros
       double centimetros = metros * 100;

       // imprimir a medida em centimetros
       System.out.println("A medida em centimetros é" + centimetros);
      

        sc.close();
        }


    }
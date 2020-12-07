import java.util.Scanner;

public class TiposPrimitivos {

public static void main(String[] args) {
    boolean t0 = true;
    char t1 = 'k';
    String t2 = "eae meu rei";  //devemos usar S em String pois é uma classe invólucro de caractere entao devemos usar a forma de classe
    byte t3 = 127;
    short t4 = 445;
    int t5 = 4444;
    float t6 = 8.5f; 
    double t7 = 8.5555;
    /*Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    String nome = teclado.nextLine();
    System.out.print("Digite o preço: ");
    float preco = teclado.nextFloat();
    System.out.println("O preço de "+ nome + " é :" + preco);
    */

 
    //teste de conversão de tipagem


    String valor = Double.toString(t7); //comando para converter um tipo para string
    int valor2 = (int) t7;             //comando para converter um tipo para o outro ----> usamos o variavelrecebida = (tipo desejado a se converter) variavelaserconvertida
    System.out.println(valor);
    System.out.println(valor2);

     //fazer uma interface que converte duas strings dadas e soma elas mostrando o resultado!!!!!!
}
    
}
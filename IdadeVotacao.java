import java.util.Scanner; //escrever scanner sempre com S 

public class IdadeVotacao {

    public static void main(String[] args) {
        int nasc = 2004;
        int idade = 2020 - nasc;
        if(idade<16)
        {
            System.out.println("Não vota");
        }
        else
        {
            if((idade >=16 && idade <18) || idade>70)
            {
                System.out.println("Voto compulsório");
            }
            else
            {
                System.out.println("Voto obrigatório");
            }
        }
        
    Scanner input = new Scanner(System.in); //*para fazermos input na linguagem usamos isso!!!!!
    int pernas;
    System.out.println("Quantas pernas? ");
    pernas = Integer.parseInt(input.nextLine());
    switch(pernas)
    {
        case 1:
        System.out.println("Saci");
        break;
        case 2:
        System.out.println("Bípede");
        break;
        case 4:
        System.out.println("Quadrupede");
        break;
        case 6:
        System.out.println("Aranha");
        break;
        default:
        System.out.println("ET");
        break;
    }
        
    }
    
}

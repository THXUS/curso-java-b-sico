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
    }
    
}

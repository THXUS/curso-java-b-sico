public class OperadoresTernarios {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 3;
        int r = (n2>n1)?0:1;  //equivale ao um if else
        /*
        !!!!!!!!!!!CONDICIONAL EQUIVALENTE!!!!!!!!!!!!!!!!!!!! 
        if(n2>n1)
            r = 1;
        else{
            r = 0;
        }
        */
        System.out.println(r);
        r = (n2>n1)?n1+n2:n1-n2;//também podemos colocar fórmulas em dentro desse operador
        System.out.println(r);
        String teste = new String("hello");


        //fazer jokenpo com gerador de números!!!! usando interface
    }
}
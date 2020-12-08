
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 3;
        float result = (n2 - n1)/7;
        System.out.println(result);

        //incremento e decremento pré e pós
/*
        int valor  = n1 + n2++; //vai fazer toda a operação e depois irá incrementar n2, ficando com valor = 7
        System.out.println(valor); //valor = 7
        System.out.println(n2); //n2 = 4
        n2--;
        int valor2  = n1 + ++n2; //irá incrementar antes e depois irá somar!!!
        System.out.println(valor2);//valor = 8;
*/
        float ar = 78.4f;
        ar = (float) Math.round(ar); //arrendondamento aritmetico
        System.out.println(ar);

        //gerador de números
        int[] arr = new int[10];
        for(int a = 0; a < arr.length; a++)
        {
            double ra = Math.random(); 
            arr[a] = (int) (5 + ra * (1000-5));
        }
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print(arr[a]+ " ");
        }


       
    }
}

public class TiposPrimitivos {
    public static void main(String[] args) {
        // inteiros
            // byte < short < int < long
                //A única diferença entre eles é a faixa de representação

        byte idade = 25;
        System.out.println("A idade informada é: " + idade);

        // boolean
        String nome = "Charles";
        boolean eBrasileiro = true;
        System.out.println("O "+ nome + "é brasileiro? \n" + eBrasileiro);

        //char
        char primeiraLetraNome = 'C';
        System.out.println("A primeira letra do nome " + nome + " é " + primeiraLetraNome);

        //double e float
            //única diferença é a faixa de representação, com o double é possível armazenar mais núneros após o divisor decimal

        double idadeDouble = 25.7;
        System.out.println("A idade do " + nome + " é " + idadeDouble + " anos");
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        // Vetor / Array: arrays com tamanhos estático
        int[] numeros = {1, 2, 3};
        System.out.println("Tamanho do array de numeros " + numeros.length);
        // para imprimir um array utilizando System.out.println é necessário importar o Arrays.toString da classe java.util.Arrays
        System.out.println("Imprimindo o array de números " + Arrays.toString(numeros));

        int[] numeros1 = new int[4]; // criação de um array com 4 elementos sem inicializar
        numeros1 = new int[] {4, 5, 6, 7};
        System.out.println("Imprimindo o array de números1 " + Arrays.toString(numeros1));

        // ArrayList: arrays com tamanho dinâmico
            // ArrayList é uma classe para representar uma estrutura de dados dinâmica
                // ArrayList precisa ser importado do java.util.Arrays

        ArrayList<Integer> idades = new ArrayList<Integer>(); // A tipagem do
        idades.add(25);
        idades.add(3);
        System.out.println("Imprimindo o array de idades " + idades.toString());

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Charles");
        nomes.add("Gécica");
        nomes.add("Jade");
        nomes.add("Agregado");
        System.out.println("Imprimindo o array de nomes " + nomes.toString());
        System.out.println("Tamanho do array de nomes " + nomes.size());
        nomes.remove(3);
        System.out.println("Novo tamanho do array de nomes " + nomes.size());
    }
}

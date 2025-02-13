public class Casting {
    public static void main(String[] args) {
        // Casting

        // Casting implícito

        int idade = 25;
        double idade1 = idade;
        System.out.println("Imprimindo idadde " + idade);

        // Casting Explícito
        idade = (int) idade1;

        char letra = 'c';
        String nome = String.valueOf(letra);
        System.out.println("Imprimindo valor de nome " + nome);
    }
}

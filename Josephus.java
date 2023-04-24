import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {

        LinkedList<Pessoa> pessoa = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroPessoaRoda, eliminacoes, eliminacoesUm;

        System.out.println("==============================================");
        System.out.println("Digite o número de pessoas presentes na roda");
        System.out.println("==============================================");
        numeroPessoaRoda = sc.nextInt();
        System.out.println("==============================================");
        System.out.println("Digite a quantidade de eliminações por vez");
        System.out.println("==============================================");
        eliminacoes = sc.nextInt();

        for (int i = 1; i <= numeroPessoaRoda; i++) {
            Pessoa pessoaAdd = new Pessoa(null,null,null,null);
            pessoa.add(pessoaAdd);
        }

        eliminacoesUm = aleatorio.nextInt(pessoa.size());
        while (pessoa.size() > 1) {
            eliminacoesUm = (eliminacoesUm + eliminacoes - 1) % pessoa.size();
            pessoa.remove(eliminacoesUm);
        }

        System.out.println("==============================================");
        System.out.println("O sobrevivente é: " + pessoa.get(0).getNome());
        System.out.println("==============================================");
    }
}
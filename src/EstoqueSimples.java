class Produto {
    String nome;
    int quantidade;
    double preco;

    void cadastrar(String n, int q, double p) {
        nome = n;
        quantidade = q;
        preco = p;
    }

    void mostrar() {
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
    }

    void adicionar(int q) {
        quantidade = quantidade + q;
    }

    void remover(int q) {
        if (q <= quantidade) {
            quantidade = quantidade - q;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}

public class EstoqueSimples {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.cadastrar("Caneta", 50, 1.50);

        p1.mostrar();

        p1.adicionar(10);
        System.out.println("\nApós adicionar:");
        p1.mostrar();

        p1.remover(20);
        System.out.println("\nApós remover:");
        p1.mostrar();

        p1.remover(100); // Teste de erro
    }
}

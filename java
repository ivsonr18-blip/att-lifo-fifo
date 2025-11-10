public class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public static void main(String[] args) {
        No primeiro = new No(10);
        No segundo = new No(20);
        primeiro.proximo = segundo;

        System.out.println("Valor do primeiro nó: " + primeiro.valor);
        System.out.println("Valor do segundo nó: " + primeiro.proximo.valor);
    }

public class Pilha {
    private int[] pilha;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new int[capacidade];
        this.topo = -1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public void empilha(int elemento) {
        if (cheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        topo++;
        pilha[topo] = elemento;
    }

    public int desempilha() {
        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        int elemento = pilha[topo];
        topo--;
        return elemento;
    }

    public int consultaTopo() {
        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        return pilha[topo];
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia");
            return;
        }
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
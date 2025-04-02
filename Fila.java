public class Fila{
    private int[] fila;
    private int inicio;
    private int fim;
    private int elementos;

    public Fila(int capacidade) {
        fila = new int[capacidade];
        inicio = 0;
        fim = 0;
        elementos = 0;
    }

    public boolean vazia() {
        return elementos == 0;
    }

    public void insere(int elemento) {
        if (elementos == fila.length) {
            System.out.println("Fila cheia!");
            return;
        }
        fila[fim] = elemento;
        fim = (fim + 1) % fila.length;
        elementos++;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int elemento = fila[inicio];
        inicio = (inicio + 1) % fila.length;
        elementos--;
        return elemento;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        for (int i = 0; i < elementos; i++) {
            System.out.print(fila[(inicio + i) % fila.length] + " ");
        }
        System.out.println();
    }

}
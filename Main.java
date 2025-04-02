public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println("\n-------- PILHA --------");
        System.out.println("Pilha inicial:");
        pilha.imprime();

        System.out.println("\nEmpilhando 10, 20, 30:");
        pilha.empilha(10);
        pilha.empilha(20);
        pilha.empilha(30);

        System.out.print("Pilha após empilhar: ");
        pilha.imprime();

        System.out.println("Elemento do topo: " + pilha.consultaTopo());

        System.out.println("Desempilhando! . . .  ");
        pilha.desempilha();
        System.out.print("Pilha após desempilhar: ");
        pilha.imprime();

        Fila fila = new Fila(5);

        System.out.println("\n-------- FILA --------");
        System.out.println("Fila inicial:");
        fila.imprime();

        System.out.println("\nAdicionando elementos:");
        fila.insere(10);
        fila.insere(20);
        fila.insere(30);
        fila.insere(40);
        fila.insere(50);
        System.out.print("Fila atual: ");
        fila.imprime();

        System.out.println("\nRemovendo um elemento: ");
        fila.remove();
        System.out.print("Fila atual: ");
        fila.imprime();
    }
}
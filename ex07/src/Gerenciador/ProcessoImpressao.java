package Gerenciador;

public class ProcessoImpressao {


    private Node first;
    private Node last;

    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void adicionarAFila(String data) {
        Node newNode = new Node(data);

        if (this.last == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        System.out.println("Adicionado com sucesso.\n");
    }

    public String imprimir() {
        if (this.first == null) {
            throw new IllegalStateException("Fila de impressão está vazia");
        }
        String data = this.first.data;
        this.first = this.first.next;
        if (this.first == null) {
            this.last = null;
        }
        return data;
    }

    public void printFila() {
        Node temp = this.first;
        if (temp == null) {
            System.out.println("Não há nada a ser impresso\n");
            return ;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}

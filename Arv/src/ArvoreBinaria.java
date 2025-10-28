public class ArvoreBinaria {

    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int dado) {
        
        No novoNo = new No(dado);

        if (this.raiz == null) {
            this.raiz = novoNo;
            return;
        }

        No noAtual = this.raiz;

        while (true) {

            if (dado < noAtual.dado) {
                
                if (noAtual.esquerda == null) {
                    noAtual.esquerda = novoNo;
                    return;
                } else {
                    noAtual = noAtual.esquerda;
                }

            } else if (dado > noAtual.dado) {

                if (noAtual.direita == null) {
                    noAtual.direita = novoNo;
                    return;
                } else {
                    noAtual = noAtual.direita;
                }
            } else {
                System.out.println("Valor " + dado + " já existe.");
                return;
            }
        }
    }
}
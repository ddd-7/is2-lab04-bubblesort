package pe.edu.unsa.is2.lab04;

public class BubbleSort implements ISorter {

    @Override
    public void bubbleSort(int[] vet) {
        int tamanho = vet.length;
        for (int i = tamanho; i >= 2; i--) {              // nodo 2
            for (int j = 1; j <= i - 1; j++) {            // nodo 3
                if (vet[j - 1] > vet[j]) {                // nodo 4
                    intercambiar(vet, j - 1, j);          // nodo 5
                }
            }                                             // nodo 6: cierre del if y j++
        }                                                 // nodo 7: i--
    }

    private void intercambiar(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }
}

package pe.edu.unsa.is2.lab04;

public class BubbleSort implements ISorter {

    @Override
    public void bubbleSort(int[] vet) {
        int tamanho = vet.length;
        for (int i = tamanho; i >= 2; i--) {              // nodo 2
            for (int j = 1; j <= i - 1; j++) {            // nodo 3
                if (vet[j - 1] > vet[j]) {                // nodo 4
                    int aux = vet[j - 1];                 // nodo 5
                    vet[j - 1] = vet[j];
                    vet[j] = aux;
                }
            }                                             // nodo 6: cierre del if y j++
        }                                                 // nodo 7: i--
    }
}

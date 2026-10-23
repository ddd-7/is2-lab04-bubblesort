package pe.edu.unsa.is2.lab04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Suite BubbleSortTest - caja blanca (decisiones + condicion simple)")
class BubbleSortTest {

    private ISorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSort(); 
    }

    @AfterEach
    void tearDown() {
        sorter = null; 
    }

    // CP1: camino 1-2-8
    @Test
    @DisplayName("CP1: camino 1-2-8, lista de un elemento no entra a ningun for")
    void testCP1_unElemento() {
        // Arrange
        int[] vet = {5};
        int[] expected = {5};

        // Act
        sorter.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "Una lista de un elemento ya esta ordenada");
    }

    // CP2: camino 1-2-3-7-2-8 -> NO EJECUTABLE.
    // Si i >= 2 entonces i-1 >= 1, y con j = 1 la condicion j <= i-1 es siempre
    // verdadera la primera vez. No existe entrada que haga falsa la decision 3 al entrar.

    // CP3: camino 1-2-3-4-6-3-7-2-8
    @Test
    @DisplayName("CP3: camino 1-2-3-4-6-3-7-2-8, decision 4 falsa, no hay intercambio")
    void testCP3_sinIntercambio() {
        // Arrange
        int[] vet = {1, 2};
        int[] expected = {1, 2};

        // Act
        sorter.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "Si ya esta ordenada no debe haber intercambio");
    }

    // CP4: camino 1-2-3-4-5-6-3-7-2-8
    @Test
    @DisplayName("CP4: camino 1-2-3-4-5-6-3-7-2-8, decision 4 verdadera, si hay intercambio")
    void testCP4_conIntercambio() {
        // Arrange
        int[] vet = {2, 1};
        int[] expected = {1, 2};

        // Act
        sorter.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "La lista deberia quedar ordenada ascendentemente");
    }
}

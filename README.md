# Laboratorio 04 - xUnit y Cobertura de Codigo 

Pruebas unitarias de caja blanca del metodo `bubbleSort` con JUnit 5 y cobertura con JaCoCo (Java + Maven).

## Estructura
- `src/main/java/pe/edu/unsa/is2/lab04/`: `ISorter` y `BubbleSort`
- `src/test/java/pe/edu/unsa/is2/lab04/`: `BubbleSortTest`
- `docs/reporte-ejecucion-pruebas/`: reporte de ejecucion (surefire)
- `docs/reporte-cobertura-jacoco/`: reporte HTML de cobertura (abrir `index.html`)

## Casos de prueba
| ID CP | Camino | Valores de prueba | Resultado esperado |
|---|---|---|---|
| CP1 | 1-2-8 | `[5]` | `[5]` |
| CP2 | 1-2-3-7-2-8 | No existe entrada  | No aplica |
| CP3 | 1-2-3-4-6-3-7-2-8 | `[1,2]` | `[1,2]` |
| CP4 | 1-2-3-4-5-6-3-7-2-8 | `[2,1]` | `[1,2]` |

Complejidad ciclomatica V(G) = 4.

## Ejecutar
    mvn clean test

El reporte de cobertura queda en `target/site/jacoco/index.html`
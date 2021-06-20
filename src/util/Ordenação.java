package util;

import model.Atletas;

/**
 *
 * @author Leonardo
 */
public class Ordenação {

    public static Atletas[] buubleSort(Atletas[] atletas) {
        for (int i = 0; i < atletas.length; i++) {
            for (int j = 0; j < atletas.length - 1; j++) {
                if (atletas[j].getId() > atletas[j + 1].getId()) {
                    Atletas aux = atletas[j];
                    atletas[j] = atletas[j + 1];
                    atletas[j + 1] = aux;
                }
            }
        }
        return atletas;
    }

    public static Atletas[] quicksort(Atletas[] atleta, int began, int end) {
        int i, j, pivo;
        Atletas aux;
        i = began;
        j = end - 1;
        pivo = atleta[Math.round((began + end) / 2)].getId();
        while (i <= j) {
            while (atleta[i].getId() < pivo && i < end) {
                i++;
            }
            while (atleta[j].getId() > pivo && j > began) {
                j--;
            }
            if (i <= j) {
                aux = atleta[i];
                atleta[i] = atleta[j];
                atleta[j] = aux;
                i++;
                j--;
            }
        }
        if (j > began) {
            quicksort(atleta, began, j + 1);
        }
        if (i < end) {
            quicksort(atleta, i, end);
        }
        return atleta;
    }

    public static Atletas[] insertionSort(Atletas[] atletas) {

        for (int i = 1; i < atletas.length; i++) {

            Atletas aux = atletas[i];
            int j = i;

            while ((j > 0) && (atletas[j - 1].getId() > aux.getId())) {
                atletas[j] = atletas[j - 1];
                j -= 1;
            }
            atletas[j] = aux;

        }
        return atletas;
    }

    public static Atletas[] SelectionSort(Atletas[] atleta, int tam) {
        for (int indice = 0; indice < tam; ++indice) {
            int indiceMenor = indice;
            for (int indiceSeguinte = indice + 1; indiceSeguinte < tam; ++indiceSeguinte) {
                if (atleta[indiceSeguinte].getId() < atleta[indiceMenor].getId()) {
                    indiceMenor = indiceSeguinte;
                }
            }
            Atletas aux = atleta[indice];
            atleta[indice] = atleta[indiceMenor];
            atleta[indiceMenor] = aux;
        }
        return atleta;
    }

}

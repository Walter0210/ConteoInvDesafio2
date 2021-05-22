import javafx.scene.chart.ScatterChart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {
    public static void main(String[] args) {
        File arch = new File("src/lote01.txt");
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        try {
            Scanner myReader = new Scanner(arch);

            while (myReader.hasNextLine()) {
                int n = parseInt(myReader.nextLine());
                numeros.add(n);
                //System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    private class MergeSort {
        // vector auxiliar para almacenar las copias temporales
        private int temp[];
        private int[] v;

        // ordenamiento Merge Sort
        public void ordenar() {
            int n = v.length;
            temp = new int[n];
            sort(0, n - 1);
        }

        private void sort(int izq, int der) {
            if (izq < der) {
                int centro = (izq + der) / 2;
                sort(izq, centro);
                sort(centro + 1, der);
                merge(izq, centro, der);
            }
        }

        private void merge(int izq, int centro, int der) {
            for (int i = izq; i <= der; i++) {
                temp[i] = v[i];
            }

            int i = izq, j = centro + 1, k = izq;
            while (i <= centro && j <= der) {
                if (temp[i] <= temp[j]) {
                    v[k] = temp[i];
                    i++;
                } else {
                    v[k] = temp[j];
                    j++;
                }
                k++;
            }

            while (i <= centro) {
                v[k] = temp[i];
                k++;
                i++;
            }
        }
    }
}
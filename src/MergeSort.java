import java.util.Arrays;

public class MergeSort{

    private Integer[] v;
    private Integer[] vectorOriginal;


    public MergeSort(Integer[] v) {
        this.v = Arrays.copyOf(v, v.length);
        vectorOriginal = v;
    }

    // vector auxiliar para almacenar las copias temporales
    private int temp[];

    // ordenamiento Merge Sort
    public long contar() {
        int n = v.length;
        temp = new int[n];
        return count(0, n - 1);
    }

    private long count(int izq, int der) {
        long inv = 0;
        if (izq < der) {
            int centro = (izq + der) / 2;
            long x = count(izq, centro);
            long y = count(centro + 1, der);
            long z = countSplitInversions(izq, centro, der);
            inv = x + y + z;
        }
        return inv;
    }

    private long countSplitInversions(int izq, int centro, int der) {
        long contador = 0;
        for (int i = izq; i <= der; i++) {
            temp[i] = v[i];
        }

        int i = izq, j = centro + 1, k = izq;
        while (i <= centro && j <= der) {
            if (temp[i] <= temp[j]) {
                v[k] = temp[i];
                i++;
            } else {
                contador += (centro+1-i) ;
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
        return contador;
    }
}
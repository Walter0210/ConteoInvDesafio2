import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {
    public static void main(String[] args) {
        File arch = new File("src/lote03.txt");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer[] v;

        try {
            Scanner myReader = new Scanner(arch);

            while (myReader.hasNextLine()) {
                int n = parseInt(myReader.nextLine());
                numeros.add(n);
                //System.out.println(data);
            }
            v = numeros.toArray(new Integer[numeros.size()]);
            MergeSort mergeSort1 = new MergeSort(v);
            System.out.println(mergeSort1.contar());

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }



}




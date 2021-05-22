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
        }
            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
}wa

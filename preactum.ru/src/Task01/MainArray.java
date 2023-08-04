package Task01;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainArray {
    //static int id;
    static String name;
    static String region;
    static String district;
    static int population;
    static String foundation;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/Задача ВС Java Сбер.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
                //Выделяем элементы из строки и помещаем в строковый(String) массив
                String[] array = scanner.nextLine().split(";");
                //id = Integer.parseInt(array[0]); //- в задании не требуется вывод этого элемента,
                // поэтому ему не присваиваем значения
                name = array[1];
                region = array[2];
                district = array[3];
                population = Integer.parseInt(array[4]);
                foundation = array[array.length - 1];

                System.out.println(toPrint(array));
        }
        scanner.close();
    }
    public static String toPrint(String[] array) {

        return "City{name=" + "\'"+ name + "\', " + "region=" + "\'" + region + "\', " +
                "district=" + "\'" + district + "\', " + "population=" + "\'" + population +
                "\', " + "foundation=" + "\'" + foundation + "\'}";
    }
}

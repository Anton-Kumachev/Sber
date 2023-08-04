package Task01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MainArrayList {
    static int id;
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

            //Выделяем элементы из строки и помещаем в строковый(String) список ArrayList
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(Arrays.asList(array));

            //id = Integer.parseInt(list.get(0));
            name = arrayList.get(1);
            region = arrayList.get(2);
            district = arrayList.get(3);
            population = Integer.parseInt(arrayList.get(4));
            foundation = arrayList.get(arrayList.size() - 1);

            System.out.println(toPrint(arrayList));
        }

        scanner.close();
    }
public static String toPrint(ArrayList<String> list) {
        return "City{name=" + "\'"+ name + "\', " + "region=" + "\'" + region + "\', " +
                "district=" + "\'" + district + "\', " + "population=" + "\'" + population +
                "\', " + "foundation=" + "\'" + foundation + "\'}";
    }
}

// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс 
// ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), 
// выдающий продукт, соответствующий имени, объему и температуре.

// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков 
// и позвольте покупателю купить товар.

package ООП.L1;

import java.util.Arrays;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(Arrays.asList(
                new HotDrinksMachine("coffe", 100),
                new HotDrink("tea", 250, 70),
                new HotDrink("icetea", 500, 5)

        ));
        int i = 0;
        while (i < 4) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf(
                    "Choose 'coffe' or 'tea' or 'icetea'.");
            String name = iScanner.nextLine();
            name = name.toLowerCase();
            if (!(name.equals("tea") || name.equals("coffe") || name.equals("icetea"))) {
                System.out.println("Drink's not found. Name is incorrect.");
                break;
            }
            System.out.printf(
                    "Choose volume 100 or 250 or 500.");
            String volume = iScanner.nextLine();
            int volumeInt = Integer.parseInt(volume);
            if (!(volumeInt == 100 || volumeInt == 250 || volumeInt == 500)) {
                System.out.println("Drink's not found. Volume is incorrect.");
                break;
            }
            System.out.printf(
                    "Choose temperature 70 or 5.");
            String t = iScanner.nextLine();
            int tInt = Integer.parseInt(t);
            if (tInt == 70 || tInt == 5) {
                System.out.println(machine.findDrink(name, volumeInt, tInt));
            } else {
                System.out.println("Drink's not found. Temperature is incorrect.");
                break;
            }
            i++;
            iScanner.close();
        }
    }
}

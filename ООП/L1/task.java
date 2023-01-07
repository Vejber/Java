// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс 
// ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), 
// выдающий продукт, соответствующий имени, объему и температуре.

// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков 
// и позвольте покупателю купить товар.

package ООП.L1;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(Arrays.asList(
                new HotDrinksMachine("coffe", 100),
                new HotDrink("tea", 250, 70),
                new HotDrink("icetea", 500, 5)

        ));

        System.out.println(machine.findDrink("tea", 250, 70));
    }

}

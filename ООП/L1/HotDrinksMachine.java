// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс 
// ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), 
// выдающий продукт, соответствующий имени, объему и температуре.

// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков 
// и позвольте покупателю купить товар.

package ООП.L1;

public class HotDrinksMachine {
    String name;
    int volume;

    public HotDrinksMachine(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
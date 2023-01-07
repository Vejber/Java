package ООП.L1;

import java.util.List;

public class VendingMachine {
    private List<HotDrinksMachine> products;

    public VendingMachine(List<HotDrinksMachine> products) {
        this.products = products;
    }

    public HotDrinksMachine findDrink(String name, int volume, int temperature) {
        for (HotDrinksMachine product : products) {
            if (!(product instanceof HotDrink)) {
                continue;
            }
            HotDrink hotDrink = (HotDrink) product;

            if (product.getName().equals(name) && hotDrink.getVolume() == volume
                    && hotDrink.getTemperature() == temperature) {
                return product;
            }

            throw new IllegalStateException("Drink's not found.");
        }
        return null;
    }
}

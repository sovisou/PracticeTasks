package opt;

public class Main {
    public static void main(String[] args) {
        Coffee coffeeWithSugar = new Coffee(new Sugar(5));
        Coffee coffeeWithoutSugar = new Coffee(null);

        Integer quantityWithSugar = coffeeWithSugar.getSugar().orElse(0);
        Integer quantityWithoutSugar = coffeeWithoutSugar.getSugar().orElse(10);

        System.out.println("Quantity with sugar: " + quantityWithSugar);
        System.out.println("Quantity without sugar: " + quantityWithoutSugar);

    }
}

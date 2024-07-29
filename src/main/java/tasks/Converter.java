package tasks;

public class Converter {
    /**
     * Реалізуй метод toKiloPerLiter, який повертає кількість кілометрів на літр
     * на основі кількості миль на імперський галон mpg.
     * Примітки:
     * округли результат до двох знаків після коми
     * якщо результат закінчується на 0, його слід округлити без 0.
     * Таким чином, замість 5,50, ми повинні отримати 5,5
     * 1 імперський галон = 4,54609188 літрів
     * 1 миля = 1,609344 кілометрів
     */

    private static final float IMPERIAL_GALLON = 4.54609188f;
    private static final float MILE = 1.609344f;

    public static float toKiloPerLiter(float mpg) {
        float converter = (mpg * MILE) / IMPERIAL_GALLON;
        float roundedConverter = Math.round(converter * 100.0f) / 100.0f;
        return roundedConverter;
    }
}

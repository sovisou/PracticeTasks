package tasks;

public class Swap {
    /**Є клас Swap, який містить метод swapValues для перестановки значень масиву з двох елементів.
     Однак виявляється, що елементи не переставляються після виклику методу.
     Зможеш зрозуміти, що тут не так, і виправити помилку?*/

    public Object[] arguments;

    public Swap(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}

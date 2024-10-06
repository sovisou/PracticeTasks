package opt;

import java.util.Optional;

public class Coffee {
    private Sugar sugar;

    public Coffee(Sugar sugar) {
        this.sugar = sugar;
    }

    public Optional<Integer> getSugar() {
        return Optional.ofNullable(sugar)
                .map(Sugar::getQuantity);
    }
}

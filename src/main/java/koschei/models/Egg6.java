package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private final Needle7 destroyNeedle;

    public Egg6(Needle7 destroyNeedle) {
        this.destroyNeedle = destroyNeedle;
    }


    @Override
    public String toString() {
        return ", в яйце иголка " + destroyNeedle.toString();
    }
}

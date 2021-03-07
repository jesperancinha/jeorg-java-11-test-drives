package org.jesperancinha.java11.crums.crum30;

import java.util.Arrays;
import java.util.stream.Collectors;

@Potatos({@Potato(id = 1,
        name = "Baking"), @Potato(id = 2,
        name = "FryingPotato")})
public class MashedPotatoes {

    @Override
    public String toString() {
        return Arrays.stream(this.getClass()
                .getAnnotations())
                .map(x -> x.annotationType()
                        .toString())
                .collect(Collectors.joining());
    }
}

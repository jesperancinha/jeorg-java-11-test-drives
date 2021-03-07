package org.jesperancinha.java11.inner.outer;

/**
 * SledgeHammer
 */
public class SledgeHammer {

    /**
     * FruitCake
     */
    public abstract class FruitCake {
        // Inner classes cannot have static declarations
        // public static  int year = 1985;
        public static final int year = 1985;

        abstract String bake();
    }

    /**
     * Anonymous classes cannot be static
     * Anonymous must follow construction rules of the super class
     * Anonymous classes cannot define their own constructors
     *
     * @return {@link FruitCake}
     */
    public FruitCake getFruitCake() {
        return new FruitCake() {
            public String bake() {
                return "--- baking fruit cage ---";
            }
        };
    }

    public void letsTestInnerEffectivelyFinal() {
        //
        var fruitCakes = "Open up your fruit cakes";
        var fruitCakes2 = "Open up your fruit cakes";
        fruitCakes2 = "Where the fruit is as sweet as can be";
        var newFruitCake = new FruitCake() {
            @Override
            String bake() {
                // Variable 'fruitCakes2' is accessed from within inner class, needs to be final or effectively final
                // return String.format("--- This is another fruit cage baking...\"%s\" ---", fruitCakes2);
                return String.format("--- This is another fruit cage baking...\"%s\" ---", fruitCakes);
            }
        };
        System.out.println(newFruitCake.bake());
    }
}

package instanceOf;

import java.io.Serializable;

class HeavyAnimal {
}

class Hippo extends HeavyAnimal /*implements Serializable*/{
}

class Elephant extends HeavyAnimal {
}

public class Example {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;
        boolean b2 = hippo instanceof HeavyAnimal;
        boolean b3 = hippo instanceof Elephant;
        System.out.println(b1 + ", " + b2+", "+ b3 );
        Hippo h = new Hippo();
//        compile error
//        boolean b4 = h instanceof Elephant;
        HeavyAnimal an = new HeavyAnimal();
        boolean b0 = an instanceof Hippo;

        HeavyAnimal hippo11 = new Hippo();
        boolean b5 = hippo11 instanceof Object;
        Hippo nullHippo = null;
        boolean b6 = nullHippo instanceof Object;
        boolean b7  = h instanceof Serializable;
        System.out.println(b7);
    }
}

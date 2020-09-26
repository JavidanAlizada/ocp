package b;

import advanced_class_design.a.BB;
import advanced_class_design.a.The;

public class AN extends The {

    //    public olmasa Main metodda error yaranacaq
    public void hello() {
        System.out.println();
    }

    @Override
    public BB hi() {
        super.hi();
        return null;
    }
}


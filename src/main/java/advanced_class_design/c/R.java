package advanced_class_design.c;

public class R {

    public int a;
     {
        a=100;
    }

    public R() {
        System.out.println(a);
        a = 50;
    }
}

class Yoxla{
    public static void main(String[] args) {
        R r = new R();
        System.out.println(r.a);
    }
}

interface A { // by default package-private but can be public at top level

    // public abstract void show(); // by default public and abstract 
    // public abstract void config();

    int age = 44; // automatically public static final 
    public static final String name = "Ashu";

    void show();

    void config();

}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

    public void run() {
        System.out.println("running");
    }

}


public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        
        Y obj1 = new B();
        obj1.run();

        int num = A.age;
        System.out.println(num);
    }
}
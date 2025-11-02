interface  Computer {
    public abstract void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("coding, compile, run : Faster ");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer ashu = new Developer();
        ashu.devApp(desk);
        
    }
}

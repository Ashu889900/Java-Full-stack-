abstract class A {
    abstract public void show();
}

// class B extends A {
//         public void show() {
//             System.out.println("in B show");
//         }
// }    


public class Demo {
    public static void main(String[] args) {
        A obj = new A() // Object Creation on anonymous*
        {
            @Override
            public void show() {
                System.out.println("in B show");
            }
        };
        obj.show();
        System.out.println(obj);
    }
}
enum Status {
    Running, Failed, Pending, Success;
}


public class Demo {
    public static void main(String[] args) {

        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println("Status : "+s+ " : " + s.ordinal());
        }
        
    }
}
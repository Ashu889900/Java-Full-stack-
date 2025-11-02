enum Status {
    Running, Failed, Pending, Success; 
}

public class Main {
    public static void main(String[] args) {
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Status Failed");
                break;
            case Pending:
                System.out.println("On process");
                break;
            case Success:
                System.out.println("Done");
                break;
        }
    }
}

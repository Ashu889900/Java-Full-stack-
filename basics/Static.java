package basics;
class Message {

    public void printMessage(int message) {
        System.out.println("Message primitive: " + message);

    }

    public void printMessage(Integer message) {

        System.out.println("Message object: " + message);

    }

}

class Main {

    public static void main(String[] ars) {

        Message ob = new Message();

        ob.printMessage(Integer.valueOf(5));

    }

}
public class Main {
    public static void main(String[] args) {
    // work 1
        int x = 9;
        byte y = 1;
        short z = 220;
        long a = 350l;
        float b = 1.7f;
        double c = 3.4;
        boolean xIsAdult = x < 15;
        char d = 44;
    // work 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double wOfAllBoxers = boxer1 + boxer2;
        double wDiffer = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + wOfAllBoxers);
        System.out.println("Разница в весе боксеров " + wDiffer);

     // work 3
         byte banan = 5;
         byte plombir = 2;
         byte egg = 4;
         short milk = 2;
         byte ves1Banan = 80;
         byte ves1Plombir = 100;
         byte ves1Egg = 70;
         short ves1Milk = 150;
         int VesZavtrakGr = banan * ves1Banan + plombir * ves1Plombir +
                 egg * ves1Egg + milk * ves1Milk;
         double VesZavtrakKg = VesZavtrakGr % 1000;
            System.out.println("Общий вес завтрака в граммах " + VesZavtrakGr);
            System.out.println("Общий вес завтрака =  " + VesZavtrakKg + " киллограм");


    }
}

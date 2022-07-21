public class Test1 {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();


        bus1.num(1);
        bus2.num(2);
        taxi1.num(1);
        taxi2.num(2);
        bus1.takePassanger(20, 6);
        bus2.takePassanger(30, 0);
        taxi1.takePassanger(2,3);
        taxi2.takePassanger(1,1);
        taxi1.destination("서울역", 10);
        taxi2.destination("미국",3500);





        bus1.fuel(-50, 20);
        bus2.fuel(-80, 10);
        taxi1.fuel(-30,30);
        taxi2.fuel(-81,65);


       bus1.showInfo1();
       bus2.showInfo1();
       taxi1.showInfo2();
       taxi2.showInfo2();

    }

}

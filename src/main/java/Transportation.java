public class Transportation {
    int num;
    int passanger;
    int fuelVolume = 100;
    int usefuel;
    int leftfuel;
    int leftSeat;



    public Transportation() {

    }
    public void num(int num){
        this.num = num;
    }
    public void fuel(int usefuel, int addfuel){
        this.usefuel = usefuel;
                   if(addfuel ==0){
                leftfuel = fuelVolume + usefuel;
            }else{
                leftfuel = fuelVolume + usefuel + addfuel;
            }






    }


}


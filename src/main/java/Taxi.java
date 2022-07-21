public class Taxi extends Transportation{
    String takePassanger;
    int passangerMax = 4;
    int taxiFee = 3000;
    String  destination;
    int status;
    int distance;
    int finalFee;;
    int leftSeat;



    public Taxi() {


         }
    public void takePassanger(int passangerNum, int afterPassanger){
        this.passanger = passangerNum;


        if(passangerNum > passangerMax || passangerNum + afterPassanger > passangerMax){
            this.takePassanger = "탑승 초과입니다";
        }else {
            this.leftSeat = passangerMax - passangerNum;
            this.takePassanger = String.valueOf(this.leftSeat)+"자리 남았습니다.";
            if (afterPassanger !=0 && leftSeat >= afterPassanger){
                this.leftSeat = passangerMax - passangerNum - afterPassanger;
                this.takePassanger = "추가로 더 " + afterPassanger +"명 더 탑승하여 " + " 현재 탑승객 수는 " + String.valueOf(passangerNum + afterPassanger) + "명 그리고 "+ String.valueOf(this.leftSeat)+"자리 남았습니다." ;
            }
        }


    }



    public void destination(String destination , int distance){
        this.destination = destination;
        this.distance = distance;
        finalFee = 3000 + this.distance * 500;
    }

         public void showInfo2(){
             System.out.println("택시" + this.num + "의 탑승객 수는" + this.passanger + "명 이고 "+ leftSeat + "개 의 자리가 남았습니다. 기본 요금은 " + taxiFee + "원 입니다." + this.takePassanger + " 목적지는 " + this.destination + "이고 목적지까지의 거리는 "+ this.distance + "km 입니다. 지불할 요금은 " + finalFee + "원 입니다. " +" 주유량은 " + leftfuel + " 남았습니다." );
         }
}


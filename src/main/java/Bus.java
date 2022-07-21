public class Bus extends Transportation{
    int passangerMax = 30;
    String takePassanger;
    int busFee1;
    int busFee2;
    int leftSeat1;


    public Bus() {

    }
    public void takePassanger(int passangerNum, int afterPassanger){
        this.passanger = passangerNum;
        this.busFee1 = 1000 * passangerNum;
        this.busFee2 = 1000 * afterPassanger;

        if(passangerNum > passangerMax || passangerNum + afterPassanger > passangerMax){
            this.takePassanger ="탑승 초과입니다";
        }else {
            this.leftSeat = passangerMax - passangerNum;
            this.takePassanger = String.valueOf(this.leftSeat)+"자리 남았습니다.";
            if (afterPassanger !=0 && leftSeat >= afterPassanger){
                this.leftSeat1 = passangerMax - passangerNum - afterPassanger;
                this.takePassanger = "추가로 더 " + afterPassanger +"명 더 탑승하여 " + "요금은 " +this.busFee2 +"원 입니다." + " 현재 탑승객 수는 " + String.valueOf(passangerNum + afterPassanger) + "명 그리고 "+ String.valueOf(this.leftSeat)+"자리 남았습니다." ;
            }
        }


    }

    public void showInfo1(){
        System.out.println("버스"+this.num+  "의 탑승 승객 수는 " +this.passanger + "명 이고 "+this.leftSeat +"개의 자리가 남았습니다. 요금은 "+this.busFee1+"원 입니다. " + this.takePassanger + " 주유량은 " + leftfuel + " 남았습니다." );
    }
}

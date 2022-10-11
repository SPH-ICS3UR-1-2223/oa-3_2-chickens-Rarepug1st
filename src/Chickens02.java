public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
double dailyAverage =0;
double monthlyAverage=0;
double EggCount=0;
double monthlyProfit=0;

EggCount+=100;
EggCount+=121;
EggCount+=117;
dailyAverage = EggCount/3.0;
monthlyAverage = dailyAverage*30;


        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int totalEggs=0;
     int eggPerChicken=4;
     int chickenCount=8;
     int Totaldays=1;
     totalEggs= eggPerChicken*chickenCount;
 // tue
     chickenCount++;
     totalEggs+= eggPerChicken*chickenCount;
     // wed 
     chickenCount /=2;
     totalEggs+= eggPerChicken*chickenCount;
  //
     
    System.out.println(totalEggs);
         
    }   
}

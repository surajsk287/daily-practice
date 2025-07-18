package Day04;

public class WaterBottleExchange {
    public int numWaterBottle(int numberOfBottle, int numberOfBottleExchange){
        int ans=numberOfBottle;
        while (numberOfBottle>=numberOfBottleExchange) {
            int newBottle=numberOfBottle/numberOfBottleExchange;
            int remBottle=numberOfBottle%numberOfBottleExchange;
            ans +=newBottle;
            numberOfBottle=newBottle+remBottle;
        }
        return ans;
    }
    public static void main(String[] args) {
        WaterBottleExchange wbe=new WaterBottleExchange();
        int nb=9;
        int nbe=3;
        System.out.println(wbe.numWaterBottle(nb, nbe));
    }
}

import java.util.TreeMap;
import java.util.List;

/* The products of a bank account.
*/

public class Products{
    private float savings = 0;
    private float checkings = 0;
    private TreeMap<Double, Double> moneyMarket =  new TreeMap<Double, Double>();
    private TreeMap<Double, Double> cD =  new TreeMap<Double, Double>();
    
    public void increaseSavings(Double num){
        this.savings +=  num;
    }

    public void decreaseSavings( Double num){
        this.savings -= num;
    }

    public void increaseCheckings(Double num){
        this.checkings += num;
    }

    public void decreaseCheckings(Double num){
        this.checkings -= num;
    }


    public void newCD(Double time, Double num){
        this.cD.put(time, num);
    }

    public double getCdValue(){
        return (Math.pow(.0084, this.cD.firstKey())* this.cD.get(this.cD.get(this.cD.firstKey())));
    }

    public double getSavingsValue(){
        return this.savings;
    }

    public double getCheckingsValue(){
        return this.checkings;
    }

    public void newMoneyMarket(Double num, Double time){
        this.moneyMarket.put(num, time);
    }

    public double getmoneyMarketValue(){
        return Math.pow(.009, this.moneyMarket.firstKey() )* this.cD.get(this.moneyMarket.firstKey());
    }

    public static void main(String args[]){

    }
}
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;
class Calculate
{
    int principal;
    int rate;
    int time;
    double simpleInterest;
    double compoundInterest;
    Calculate(int principal,int rate,int time)
    {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double SimpleInterest()
    {
        simpleInterest = (principal*rate*time)/100;
        return simpleInterest;
    }
    public double CompoundInterest()
    {
        double value = Math.pow((1-rate/100),time);
        compoundInterest = principal*(value-1);
        return compoundInterest;
    }
}
public class Interest
{
    private static final Logger LOGGER = LogManager.getLogger(HomeConstruction.class);
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        Calculate calculate = new Calculate(principal, rate, time);
        double simpleInterest = calculate.SimpleInterest();
        double compoundInterest = calculate.CompoundInterest();
        LOGGER.debug(simpleInterest);
        LOGGER.debug(compoundInterest);
    }}


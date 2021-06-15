/**
 * This program converts tempreture units,
 * between Celsius, Fahrenheit and Kelvin.
 *
 * @author (Yoav Epstein)
 * @version (26/10/20)
 */
import java.util.Scanner;
public class Temperature
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        //Introduction & user guidance  
        System.out.println ("This program converts tempreture units, " +
            "between Celsius, Fahrenheit and Kelvin.");
        System.out.println ("Please enter a tempreture unit (Celsius,Fahrenheit or Kelvin) " + 
            "and a tempreture value:");
        String unit = scan.next();
        char u = unit.charAt(0);
        double tempreture = scan.nextDouble();

        //Conversion indicators
        final double INDICATOR_1 = (double)5/9;
        final double INDICATOR_2 = 32;
        final double INDICATOR_3 = 273.15;
        

        //Measurements output
        System.out.println("The following measurements can be converted to:");
        if(u=='C')
        {
            double cToF=Math.pow(INDICATOR_1,-1)*tempreture+INDICATOR_2;
            double cToK=tempreture+INDICATOR_3;
            System.out.print(tempreture + " C \n" + cToF +" F \n" + cToK + " K \n");
        }
        else if(u=='F')
        {
            double fToC=INDICATOR_1*(tempreture-INDICATOR_2);
            double fToK=INDICATOR_1*(tempreture-INDICATOR_2)+INDICATOR_3 
            ;System.out.print(fToC + " C \n" + tempreture + " F \n" + fToK + " K \n");
        }
        else if(u=='K')
        {
            double kToC=tempreture-INDICATOR_3;
            double kToF=Math.pow(INDICATOR_1,-1)*(tempreture-INDICATOR_3)+INDICATOR_2;
            System.out.print(kToC + " C \n" + kToF + " F \n" + tempreture + " K \n");
        }
    } // end of method main
} //end of class Temperature


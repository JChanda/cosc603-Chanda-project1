package FireDanger;

import java.io.*;

/**
 * @author Joe
 *
 */
public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO: Auto-generated Javadoc
		InputStreamReader stdin = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(stdin);
        int Snow = 0; 
        int FFM = 0;
        int Rate = 0;
        int Temp = 0;
        int Timber = 0;
        String str1, str2, str3, str4;
        
        try
        {
            System.out.print("Is it snowing/raining? 1-yes, 2-no: ");
            str1 = console.readLine();
            Snow = Integer.parseInt(str1);
            System.out.print("Was it snowing/raining in the past two days? 1-yes, 2-no: ");
            str2 = console.readLine();
            FFM = Integer.parseInt(str2);
            System.out.print("What is the temperatur, celcius?: ");
            str3 = console.readLine();
            Temp = Integer.parseInt(str3);
            System.out.print("What is today's wind speed, mph?: ");
            str4 = console.readLine();
            Timber = Integer.parseInt(str4);
        }
        catch(IOException e)
        {
            System.out.println("Input error");
            System.exit(1);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage() + " is not numeric");
            System.exit(1);
        }
        if (Snow == 1 || FFM == 1) {
            Rate = 0;
        }
        else {
        	Rate = Rate + 1;
        }
        if (Temp >= 85){
            Rate = Rate + 3;
        } else if (Temp >= 70) {
        	Rate = Rate + 2;
        } else {
        	Rate = Rate + 1;
        }
        if (Timber >= 14) {
        	Rate = Rate + 2;
        } else {
        	Rate = Rate + 1;
        }
        	System.out.println("Fire Index = " + Rate);
        }
        
    }
	
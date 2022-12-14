import java.util.Scanner;

public class PrepaidTaxi 
{
	public static void main(String args[]) 
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance travelled: ");
        int dist = in.nextInt();

        int fare  = 0;
        if (dist <= 5)
            fare = 100;
        else if (dist <= 15)
            fare = 100 + (dist - 5) * 10;
        else if (dist <= 25)
            fare = 100 + 100 + (dist - 15) * 8;
        else
            fare = 100 + 100 + 80 + (dist - 25) * 5;
            
        System.out.println("Distance covered: " + dist);
        System.out.println("Amount to be paid: " + fare);
        
        in.close();

    }
}

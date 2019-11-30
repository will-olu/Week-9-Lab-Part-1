import java.util.Scanner;

public class CountFamiles
{
	private String name;
	private numberOfFamilyMembers;
	private double familyIncome;
	private int numberOfFamilies[] k;
	
    public void getData( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of families");
        numberOfFamiles = keyboard.nextInt( );
		System.out.println("Input the income of the family.");
		double familyIncome = keyboard.nextDouble();
		
        family = new numberOfFamilies[k];
        for (int i = 0; i <= numberOfFamiles; i++) 
        {
            k[i] = new Families( );
            System.out.println("Enter data for family " + i);
            k[i].readInput( );
            System.out.println( );
        }
    }
	
	public void getIncome();
	{
		
		return double familyIncome  =nextIncome;
	}
	
	 public void computeAverage( )
    {
        double nextIncome = k[1].getIncome( );
        double highestIncome = nextIncome;
        double sum = nextIncome;
        for (int i = 2; i <= numberOfFamiles; i++)
        {
             nextSales = k[i].getIncome( );
             sum = sum + nextIncome;
             if (nextIncome > highestIncome)
                 highestIncome = nextIncome;
        }
        averageIncome = sum / numberOfFamiles;
    }
	
	public static void main(Strings [] args)
	{
		CountFamiles value = new CountFamiles();
		value.getData();
		value.computeAverage();
	}
	
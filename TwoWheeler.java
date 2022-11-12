/*Assignment1
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.
*/
package Assignments;

public class TwoWheeler {
	int noOfWheels = 2 ;
	short noOfMirrors = 2;
	long chassisNumber = 53l;
	boolean isPunctured = false;
	String bikeName ="Apache";
	double runningKM = 676.8 ;
	
	public void noOfWheels()
	{
		//int noOfWheels= 2;
		System.out.println("Number of Wheels " +noOfWheels);
		
	}
	
	public void noOfMirrors()
	{
		//short noOfMirrors= 2;
		System.out.println("No of mirrors " +noOfMirrors);
		
	}
	public void chassisNumber()
	{
		//long chassisNumber= 5656l;
		System.out.println("Number " +chassisNumber);
		
	}
	public void isPunctured()
	{
		//boolean isPunctured= false;
		System.out.println("Is my Bike punctured  " +isPunctured);
		
	}
	public void bikename()
	{
	//	String Bikename= "Apache";
		System.out.println("Bikename is " +bikeName);
		
	}
	
	public void runningkm()
	{
		//double kilometer= 676.0;
		System.out.println("Running Kilometers of my bike " +runningKM);
		
	}
	public static void main(String[] args) {
		TwoWheeler tw =  new TwoWheeler();
		tw.bikename();
		tw.noOfWheels();
		tw.chassisNumber();
		tw.isPunctured();
		tw.noOfMirrors();
		tw.runningkm();
	}

}

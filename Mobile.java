
/*
 * 
 * Assignment2
Create a class for Mobile and declare below variables with appropriate values
String mobileBrandName
char mobileLogo
short noOfMobilePiece
int modelNumber
long mobileImeiNumber
float mobilePrice
boolean isDamaged
create object for Mobile and call all the variables inside main method and print the values.
 * */
 
package Assignments;

public class Mobile {
	String mobileBrandName ="Oneplus7pro";
	char mobileLogo =1;
	short noOfMobilePiece =2;
	int modelNumber=90898;
	long mobileImeiNumber=83737377l;
	float mobilePrice = 49999f;
	boolean isDamaged=false;
	
	public void mobileBrandName()
	{
		System.out.println("MobileBrand : " +mobileBrandName);
	}
	
	public void mobileLogo()
	{
		System.out.println("Logo of Oneplus : " +mobileLogo);
	}
	
	public void noOfMobilePiece()
	{
		System.out.println("Number of pieces : " +noOfMobilePiece);
	}
	
	public void modelNumber()
	{
		System.out.println("Model Number : " +modelNumber);
	}
	
	public void mobileImeiNumber()
	{
		System.out.println("MobileImeiNumber: " +mobileImeiNumber);
	}
	
	public void mobilePrice()
	{
		System.out.println("Price of my mobile : " +mobilePrice);
	}
	
	public void isDamaged ()
	{
		System.out.println("Is my phone damaged? : " +isDamaged);
	}

	public static void main(String[] args) {
	Mobile m = new Mobile();
	m.mobileBrandName();
	m.mobilePrice();
	m.isDamaged();
	
	m.mobileImeiNumber();
	m.mobileLogo();
	m.modelNumber();
	

	}

}

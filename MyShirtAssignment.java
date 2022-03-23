
public class MyShirtAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt shirtObj1=new Shirt(38, "Green", "uspolo", 1500);
//		shirtObj1.showShirt();
		System.out.println("Shirt  details are..:"+shirtObj1);
		System.out.println("............................................................");
		
		FormalShirt formalShirtObj1=new FormalShirt(50,"Red" , "peter england", 2000,"formal");
		System.out.println("Shirt  details are..:"+formalShirtObj1);
		formalShirtObj1.showFormalShirt();
		formalShirtObj1.gotoOffice();
		System.out.println("............................................................");
		
		PlainFormalShirt pfShirt=new PlainFormalShirt(38, "blue", "Raymond", 3000, "formal", "plain");
		System.out.println("Shirt1  details are..:"+pfShirt);
		pfShirt.gotoMeeting();
		
	}

}
class Shirt
{
	int shirtSize;
	String shirtColor;
	String shirtBrand;
	float shirtPrice;
	
	public Shirt(int shirtSize, String shirtColor, String shirtBrand, float shirtPrice) 
	{
		super();
		this.shirtSize = shirtSize;
		this.shirtColor = shirtColor;
		this.shirtBrand = shirtBrand;
		this.shirtPrice = shirtPrice;
	}
	
/*	void showShirt()
	{
		System.out.println("Size of the shirt is.....:"+shirtSize);
		System.out.println("Color of the shirt is....:"+shirtColor);
		System.out.println("Brand of the shirt is....:"+shirtBrand);
		System.out.println("Price of the shirt is....:"+shirtPrice);
		
	}
*/
	@Override
	public String toString() 
	{
		return "Shirt [shirtSize=" + shirtSize + ", shirtColor=" + shirtColor + ", shirtBrand=" + shirtBrand
				+ ", shirtPrice=" + shirtPrice + "]";
	}
	
}
class FormalShirt extends Shirt
{
	String shirtType;

	public FormalShirt(int shirtSize, String shirtColor, String shirtBrand, float shirtPrice, String shirtType)
	{
		super(shirtSize, shirtColor, shirtBrand, shirtPrice);
		this.shirtType = shirtType;
	}
	
	void showFormalShirt() 
	{
		System.out.println("Hey your shirt is of "+shirtType+"type");
		
	}
	void gotoOffice()
	{
		System.out.println("Going to office by wearing "+shirtType+"shirt");
		
	}

	@Override
	public String toString() {
		return "FormalShirt [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", shirtType=" + shirtType + "]";
	}

	

	
	
}
class PlainFormalShirt extends FormalShirt
{
	String design;

	public PlainFormalShirt(int shirtSize, String shirtColor, String shirtBrand, float shirtPrice, String shirtType,
			String design) {
		super(shirtSize, shirtColor, shirtBrand, shirtPrice, shirtType);
		this.design = design;
	}
	void showPlainFormalShirt() 
	{
		System.out.println("Hey your shirt is "+design+"formal shirt");
		
	}
	void gotoMeeting()
	{
		System.out.println("Going to meeting by wearing "+design+"formalshirt");
		
	}
	@Override
	public String toString() {
		return "PlainFormalShirt [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", design=" + design + "]";
	}
	
	
	
}
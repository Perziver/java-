import java.util.Scanner;
import java.lang.Math;

class Calculator1//making function
{ 
	Scanner scf=new Scanner(System.in);
	final double PI=3.14;

	public void areaOfCircle()//making an object
	{  //function
	
	System.out.println("Enter the Radius: ");
	double r=scf.nextDouble();
	double area=PI*r*r;
	System.out.println("Area of Radius "+r+" is: "+area);
	}

	public void CircumferenceOfCircle()//making an object
	{
	System.out.println("Enter the Radius: ");
	double r=scf.nextDouble();
	double circumference=2*PI*r;
	System.out.println("Circumference Of Circle with radius " +r+ " is: "+circumference);
	}

	public void AreaOfRectangle()//making an object
	{
	System.out.print("Enter the length and breath");
	double l=scf.nextDouble();
	double b=scf.nextDouble();
	double areaRectangle=2*(l*b);
	System.out.println("Area Of Rectangle with length " +l+ " and bredth " +b+ " is: "+areaRectangle);
	}

	public void volumeOfSphere()//making an object
	{
	System.out.println("Enter the radius for sphere : ");
	double r=scf.nextDouble();
	double volume=((double)4/3)*PI*(r*r*r);
	System.out.println("Volume of sphere with radius " +r+ " is: "+volume);
	}

	public void surfaceAreaOfSphere()//making an object
	{
	System.out.println("Enter the radius for sphere : ");
	double r=scf.nextDouble();
	double surfaceArea=(double)4*PI*(r*r);
	System.out.println("Surface area of sphere with radius " +r+ " is: "+surfaceArea);
	}

	public void areaOfSquare()
	{
	System.out.println("Enter the length of square : ");
	double l=scf.nextDouble();
	double areaSquare=((double) 2*(l*l));
	System.out.println("The area of square for the length "+l+" is: "+areaSquare);
	}

	public void areaOfRightAngleTringle(){
	System.out.println("Enter the height and base for the triangle: ");
	double h=scf.nextDouble();
	double b=scf.nextDouble();
	double areaORAT=((double)1/2*h*b);
	System.out.println("The area for Right angle Triangle with height " +h+ " and base " +b+ "is: "+areaORAT);
	}

	public void areaOfEquilateralTriangle(){
	System.out.println("Enter the sides of the triangle: ");
	double s=scf.nextDouble();
	double areaOET=(Math.sqrt(3)/4*(s*s));
	System.out.println("The area for equilateral triangle with base "+s+" is: "+areaOET);
	}

	public void perimeterOfRectangle(){
	System.out.println("Enter the lenght and bredth: ");
	double l=scf.nextDouble();
	double b=scf.nextDouble();
	double perimeterOR=2*(l+b);
	System.out.println("Perimeter of Rectangle with lenght "+l+" and bredth " +b+ " is: "+perimeterOR);
	}

	public void areaOfTriangle(){
	System.out.println("Enter Height and base for the triangle: ");
	double l=scf.nextDouble();
	double b=scf.nextDouble();
	double areaOT=((double)1/2*(l*b));
	System.out.println("Area of triangle with height "+l+" and base "+b+" is: "+areaOT);
	}
}

class Calculator{
	public static void main(String[] args) {
		int choose;
		Scanner sc=new Scanner(System.in);//making scanner class
		Calculator1 cal1=new Calculator1();//making callable class


		while(true){
			
			System.out.println("***********************************");
			System.out.println("* 1. Area Of Circle.              *");
			System.out.println("* 2. Circumference Of Circle.     *");
			System.out.println("* 3. Area Of Rectangle.           *");
			System.out.println("* 4. Volume Of Sphere.            *");
			System.out.println("* 5. Surface Area Of Sphere.      *");
			System.out.println("* 6. Area Of Square.              *");
			System.out.println("* 7. Area Of Right angle Triangle.*");
			System.out.println("* 8. Area Of Equilateral Triangle.*");
			System.out.println("* 9. Perimeter Of Rectangle.      *");
			System.out.println("* 10.Area Of Triangle.            *");
			System.out.println("* 0. Exit.                        *");
			System.out.println("***********************************");
			System.out.println("Choose the number: ");
			choose=sc.nextInt();

			if (choose==1){
				cal1.areaOfCircle();//calling an object
			}
			else if(choose==2){
				cal1.CircumferenceOfCircle();
			}
			else if(choose==3){
				cal1.AreaOfRectangle();
			}
			else if(choose==4){
				cal1.volumeOfSphere();
			}
			else if(choose==5){
				cal1.surfaceAreaOfSphere();
			}
			else if(choose==6){
				cal1.areaOfSquare();
			}
			else if(choose==7){
				cal1.areaOfRightAngleTringle();
			}
			else if(choose==8){
				cal1.areaOfEquilateralTriangle();
			}
			else if(choose==9){
				cal1.perimeterOfRectangle();
			}
			else if(choose==10){
				cal1.areaOfTriangle();
			}
			else if(choose==0){
				System.exit(0);
			}
		}
	}
}

class Figure{
	double dimension1;
	double dimension2;

	Figure(double x,double y){
	dimension1=x;
	dimension2=y;	
		}
	
	double area(){
	System.out.println("Area of figure not defined");		
	return 0;
		}

}


class Rectangle extends Figure{

	Rectangle(double x,double y){	super(x,y);}
	
	double area(){
	return dimension1*dimension2;}
}


class Triangle extends Figure{

	Triangle(double x,double y){	super(x,y);}
	
	double area(){
	System.out.println("The area of triangle is ");
	return dimension1*dimension2/2;}
}


public class DynamicDispatch{
	public static void main(String[] args){
		Figure f=new Figure(5,5);
		Rectangle r=new Rectangle(10,10);
		Triangle t=new Triangle(20,20);
		Figure fig;//reference variable
		fig=r;
		System.out.print(fig.area());
		fig=t;
		System.out.print(fig.area());
		fig=f;
		System.out.print(fig.area());

		}


}

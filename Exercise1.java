//create a class box having parameterised constructor and method to calculate volume of box

class Box{
	double width,height,depth;
	Box(double w,double h,double d){
	width=w;
	height=h;	
	depth=d;
	}
	//method to return volume of box
	double volume(){
		
	return width*height*depth;
	}

	public static void main(String[] args){
	//creating reference object
	Box b1=new Box(5,7,4);
	System.out.println("The volume of box is "+b1.volume());
	}





}





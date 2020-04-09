
public class TestShape {
	public static void main(String[] args) {
		Shape obj1=new Shape();
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		//calling methods
		obj1.draw();
		obj1.erase();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
		
	}

}

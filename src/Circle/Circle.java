package Circle;

public class Circle {
	//list of properties
	double r;
	static double pi =22/7;
	
	// simple functions
	double perimeter() {
		
		return 2*Circle.pi*this.r;
	}
	
	double superficy() {
		
		return 2*Circle.pi*this.r*this.r;
	}
}

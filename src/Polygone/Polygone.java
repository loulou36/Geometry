package Polygone;

public class Polygone {
	//list of properties
	double side;
	double a;
	int numberOfSides;
	
	
	// simple functions
	double perimeter() {
		
		return this.numberOfSides*this.side;
	}
	
	double superficy() {
		
		return this.side*this.a*this.numberOfSides;
}
}
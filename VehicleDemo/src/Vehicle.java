

public class Vehicle {
int passengers;
int fuelcap;
int mpg;

Vehicle(int p, int f, int m) {
	passengers = p;
	fuelcap = f;
	mpg = m;
}

int range() {
	return fuelcap * mpg;
}
double fuelneeded(int miles) {
	return (double)miles / mpg;
	
}
//}
//public class VehconsDemo {

	public static void main(String[] args) {
	Vehicle minivan = new Vehicle(7, 16, 21);
	Vehicle sportscar = new Vehicle(2, 14, 12);
	double gallons;
	int dist = 252;
	
/*	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
*/
	gallons = minivan.fuelneeded(dist); 
	System.out.println("to go " + dist + " miles minivan needs" + gallons + " gallons of fuel.");
	System.out.println("minivan can carry " + minivan.passengers);
	minivan.range();
	
	gallons = sportscar.fuelneeded(dist);
	System.out.println("to go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	System.out.println("sportscar can carry" + sportscar.passengers);
	sportscar.range();
	
	}

}

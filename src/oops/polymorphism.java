package oops;
class vehicle{
	void speed(int maxspeed) {
		System.out.println("vehicle sppedd " +maxspeed +"kmph");
	}
	void speed(int maxspeed ,String unit) {
		System.out.println("vehicle speed "+ maxspeed +unit);
	}
}
public class polymorphism {

	
	public static void main(String[] args) {
		vehicle v= new vehicle();
		v.speed(125);
		v.speed(125,"kmph");
		
	}
}

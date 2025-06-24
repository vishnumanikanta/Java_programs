package oops;
class plane {
	String brand;
	plane(String brand){
		this.brand=brand;
	}
	void fly(String brand ,int  time) {
		System.out.println(brand + " flight has been started at time " + time +" clock");
	}
	void takeoff(String brand , int time) {
		System.out.println(brand + " flight will been take off at time " +time + " clock");
	}
}
class jet extends plane{
	
	jet(String brand) {
		super(brand);
		
	}
	void status(String status,String time) {
		System.out.println("flight will been " + status +" in " + time);
	}
	
}
public class aeroplanes {

	public static void main(String[] args) {
		jet j =new jet("spicejet");
		j.fly("spicejet",7);
		j.takeoff("spicejet",8);
		j.status("started"," 1hr");
		
		
		
		jet j1 =new jet("spicejet");
		j1.fly("spicejet",7);
		j1.takeoff("spicejet",8);
		j1.status("started"," 1hr");
		
		
		
		
		jet j2 =new jet("spicejet");
		j2.fly("spicejet",7);
		j2.takeoff("spicejet",8);
		j2.status("started"," 1hr");
		
		
		
		jet j3 =new jet("spicejet");
		j3.fly("spicejet",7);
		j3.takeoff("spicejet",8);
		j3.status("started"," 1hr");
		
		
		jet j4 =new jet("spicejet");
		j4.fly("spicejet",7);
		j4.takeoff("spicejet",8);
		j4.status("started"," 1hr");
		
		jet j5 =new jet("spicejet");
		j5.fly("spicejet",7);
		j5.takeoff("spicejet",8);
		j5.status("started"," 1hr");
		
		jet j6 =new jet("spicejet");
		j6.fly("spicejet",7);
		j6.takeoff("spicejet",8);
		j6.status("started"," 1hr");
		
		jet j7 =new jet("spicejet");
		j7.fly("spicejet",7);
		j7.takeoff("spicejet",8);
		j7.status("started"," 1hr");
		
	}

}

package oops;

public class car {
	String brand;
	int price;
	int speed;
	car(String brand , int price ,int speed ){
		this.brand=brand;
		this.price=price;
		this.speed=speed;
	}
	void displaycar() {
		System.out.println("carbrand:"+brand);
		System.out.println("carprice:"+price);
		System.out.println("carspeed:"+speed);
	}
	public static void main(String[] args) {
	car c=new car("Audi",85684878,134);
car c1=new car("bmw",172636,187);
	
c.displaycar();
c1.displaycar();
	}
}

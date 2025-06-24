package oops;

public class phones {
	String brand;
	String camera;
	String calculator ;
	String buildQuality;
	String display;
	int cost;
	int length;
	int memory;
	int ram;
	String processor;
	phones(String brand ,String camera,String calculator,String buildquality,String display,int cost,int length, int memory, int ram ,String processor){
		this.brand=brand;
		this. camera=camera;
		this .calculator=calculator;
		this.buildQuality=buildquality;
		this.display=display;
		this.cost=cost;
		this.length=length;
		this.memory=memory;
		this.ram=ram;
		this.processor=processor;
		
	}
	void displayphone() {
		System.out.println("mobilebrand:"+brand);
		System.out.println("camera megapixel:"+camera);
		System.out.println("mobile calculator:"+calculator);
		System.out.println("mobile quality:"+buildQuality);
		System.out.println("mobile display:"+display);
		System.out.println("mobile cost:"+cost);
		System.out.println("mobile length:"+length);
		System.out.println("mobile rom (memory):"+memory);
		System.out.println("mobile ram:"+ram);
		System.out.println("mobile processor:"+processor);
		
	}
	
	public static void main(String[] args) {
	phones p=new phones("realme","12mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	phones p1=new phones("oppo","19mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	phones p2=new phones("samsung","12mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	phones p3=new phones("apple","12mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	phones p4=new phones("asus rog","12mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	phones p5=new phones("vivo","12mp","yes","polycarbonate","amoled",12000,6,128,8,"snapdragon");
	p.displayphone();
	p1.displayphone();	
	p2.displayphone();
	p3.displayphone();
	p4.displayphone();
	p5.displayphone();
			

	}

}

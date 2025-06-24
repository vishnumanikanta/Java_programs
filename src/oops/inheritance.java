package oops;

class animal {
void makesound() {
	System.out.println("animal makes soud");
}
class dog extends inheritance{
	void bark()
{
	System.out.println("dog barks");	
}
}
public class inheritance{
	public static void main(String[] args) {
	 animal d =new animal();
	 d.makesound();

	}
}
}

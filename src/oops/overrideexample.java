package oops;
class animals{
	void makesound() {
		System.out.println("animal makesound");
	}
}
class dog extends animals{
	@Override
	void makesound() {
		System.out.println("dog barks");
	}
}
public class overrideexample {

	public static void main(String[] args) {
	animals a=new dog();
	dog n=new dog();
	animals d=new animals();
	a.makesound();
	d.makesound();
	n.makesound();


	}

}

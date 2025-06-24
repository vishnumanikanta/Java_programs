package oops;
 abstract class v1{
	 abstract void start();
	 public void stop() {
		 System.out.println("stooped");
	 }
 }
  class bike extends v1{
	  @Override
	  void start() {
	  System.out.println("car started ");
	  }
  }
public class abstration {

	public static void main(String[] args) {
		v1 v=new bike();
		v.start();
		v.stop();

	}

}

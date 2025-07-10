package encapsulation;
// the process of hiding the data without achieved by direct access
// or
// bundling the data like properties and behaviour 
 class student{
  private  int age;
    private  String name;


    void write() {
        System.out.println("still writing ");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	student(int age ){
		System.out.println("working");
		this.age=age;
		System.out.println("constructeer working "+age);
	}
	student( ){
		System.out.println("default constructor working");

	}

}

// Second class (not public)
public class  program_1{
    public static void main(String[] args) {
      student  p = new student(24);
      student  v = new student();
        p.setAge(23);
        p.setName("nani");
        System.out.println("Age: " + p.getAge());
        System.out.println("Name: " + p.getName());
        p.write();
    }
}

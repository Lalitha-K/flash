package inheritance;

public class child  extends parent{
	public void display2() {
		System.out.println("child class");
	}
	public static void main(String args[]) {
		
	child c=new child();
	c.display();
	c.display2();
	}

}

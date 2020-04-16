package demo;

public class Cube {
	
	void m()
	{
		System.out.println("m");
	}
	
	void n()
	{
		System.out.println("n");
		this.m();
	}

	public static void main(String[] args) {
	
		Cube a = new Cube();
		a.n();
	}

}

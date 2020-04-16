package demo;

public class Ramesh extends Mahesh {
	
	public void run() {
		System.out.println("----runing------");
	}
	
	@Override                                                // annotation
	public void walk() {
		System.out.println("----walking---2-------");
	}
   
	public void dance() {
		System.out.println("----Dancing------");
	}
	
	public void ring() {
		System.out.println("----ringing------");
	}
}

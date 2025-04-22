package javacupsulecase;

public class CupsuleCase {

	private String name;

	private double tall;
	
	private int speed;
	
	
	public CupsuleCase(String name,double tall,int speed) {
		this.name = name;
		
		this.tall = tall;
		
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTall() {
		return tall;
	}
	
	public void setName(double tall) {
		this.tall = tall;
	}
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}

}

package advance.dev;

public class Teacher extends Person {
	private String maGV;
	private double heSoLuong;
	public Teacher(String maGV, double heSoLuong) {
		super();
		this.maGV = maGV;
		this.heSoLuong = heSoLuong;
	}
	public Teacher(String name, int age, String maGV, double heSoLuong) {
		// TODO Auto-generated constructor stub
		super();
		this.name= name;
		this.age = age;
		this.maGV= maGV;
		this.heSoLuong = heSoLuong;
	}
	public String toString() {

		return maGV+" "+name+" "+age+" "+heSoLuong; 
	}
	public String getMaGV() {
		return maGV;
	}
	public String setMaGV(String maGV) {
		return this.maGV = maGV;
	}
	@Override
	public double getHeSoLLuong() {
		return heSoLuong;
	}
	public double setHeSoLuong() {
		return this.heSoLuong= heSoLuong;
	}
}

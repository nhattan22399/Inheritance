package advance.dev;

public class Student extends Person {
	public String maSV;
	public double dtb;
	public Student(String maSV, double stb) {
		super();
		this.maSV = maSV;
		this.dtb = dtb;
	}
	public Student(String name, int age, String maSV, double dtb) {
		// TODO Auto-generated constructor stub
		super();
		this.maSV = maSV;
		this.name = name;
		this.dtb = dtb;
		this.age = age;
	}
	public String toString() {
		return maSV+" "+name+" "+age+" "+dtb; 
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	@Override
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
}

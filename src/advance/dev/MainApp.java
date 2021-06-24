package advance.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class MainApp {
	public static void input(List<Person> personList ){
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so giao vien: ");
		int gv = sc.nextInt();
		for(int i = 0; i <gv; i++) {
			System.out.println("Bat dau nhap vao thong tin: ten, tuoi, ma giao vien, he so luong.");
			String name = sc.next();
			int age = sc.nextInt();
			String maGV = sc.next();
			double heSoLuong = sc.nextDouble();
			Teacher teacher = new Teacher(name, age, maGV, heSoLuong);
			personList.add(teacher);
		}
		System.out.println("nhap vao so hoc sinh: ");
		int hs = sc.nextInt();
		for(int i = 0; i <hs; i++) {
			System.out.println("Bat dau nhap vao thong tin: ten, tuoi, ma sinh vien, diem trung binh.");
			String name = sc.next();
			int age = sc.nextInt();
			String maSV = sc.next();
			double dtb = sc.nextDouble();
			Student student = new Student(name, age, maSV, dtb);
			personList.add(student);
		}
		
	}
	
	public static void print(List<Person> personList) {
			Iterator<Person> it = personList.iterator();
			while(it.hasNext()) {
				Person person = it.next();
				System.out.println(person.toString());
			}
		}
	
	public static Teacher findTeacher(List<Person> personList) {
		Person max = personList.get(0);
		for(int i = 0; i < personList.size();i++) {
			if(personList.get(i).getHeSoLLuong()> max.getHeSoLLuong())
			{
				max = personList.get(i);
			}
		}
		return (Teacher) max;
	}
	
	public static Student findStudent(List<Person> personList) {
		Person max = personList.get(0);
		for(int i = 0; i < personList.size();i++) {
			if(personList.get(i).getDtb()> max.getDtb())
			{
				max = personList.get(i);
			}
		}
		return (Student) max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		
	       try {
	    	   input(personList);
	   		System.out.println("Danh Sach: ");
	           print(personList);
	           System.out.println("Giao vien co he so luong cao nhat la: ");
	           System.out.println(findTeacher(personList));
	           System.out.println("Sinh vien co diem trung binh cao nhat la: ");
	           System.out.println(findStudent(personList));
	       }catch(Exception e) {
	    	   System.out.println(e);
	       }
	}

}

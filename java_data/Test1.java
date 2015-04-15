import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Human{
	private String name;
	private int age;
	private String address;
	
	public Human(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void showName(){
		System.out.println("–¼ "+getName()+"\n”N—î "+getAge()+"\nZŠ "+getAddress());
	}
	
}

class Student extends Human{
	private String studentID;
	
	public Student(String name,int age,String address,String ID){
		super(name,age,address);
		studentID = ID;
	}
	
	public void showName(){
		super.showName();
		System.out.println("ŠwĞ”Ô† "+studentID);
	}
}

class School{
	private List<Student> list = new ArrayList<Student>();
	
	public void addStudent(Student s){
		list.add(s);
	}
	
	public void showStudent(int i){
		try{
			Student s = list.get(i);
			s.showName();
		}catch(IndexOutOfBoundsException e){
			System.out.println("“Y‚¦š‚ÌQÆ‚É¸”s‚µ‚Ä‚¢‚Ü‚·");
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void showAllStudent(){
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()){
			Student s = itr.next();
			s.showName();
			System.out.println();
		}
	}
}

class Test1{
	public static void main(String[] args){
		School sc = new School();
		
		sc.addStudent(new Student("Fukuda",18,"Yokohama","14304013"));
		sc.addStudent(new Student("Suzuki",18,"kanagawa","14304000"));
		
		sc.showStudent(4);
		sc.showStudent(1);
		sc.showStudent(0);
		
		System.out.println();
		
		sc.showAllStudent();
	}
}

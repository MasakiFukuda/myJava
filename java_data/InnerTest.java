class Outer{
	class Inner1{
		public void run(){
			System.out.println("Inner1");
		}
	}
	
	static class Inner2{
		public void run(){
			System.out.println("Inner2");
		}
		
		public static void run2(){
			System.out.println("Inner2Static");
		}
	}
	
	public void createInner2(){
		Inner2 in2 = new Inner2();
		in2.run();
	}
}

class InnerTest{
	public static void main(String[] args){
		Outer.Inner1 in1 = new Outer().new Inner1();
		
		in1.run();
		
		Outer.Inner2.run2();
	}
	
}
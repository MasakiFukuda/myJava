class Outer{
	static class Inner{
		public void run(){
			System.out.println("Inner1");
		}
		
	}
	
	public static void createInner(){
		Inner in = new Inner();
		in.run();
	}
}

interface NoName{
	void run();
}

class InnerTest2{
	public static void main(String[] args){
		Outer.createInner();
		
		NoName n2 = new NoName(){
			public void run(){
				System.out.println("NoName Inner");
			}
		};
		
		n2.run();
	}
}

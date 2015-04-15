import java.util.function.*;

class fTest{
	public static void main(String[] args){
		Function<Integer,Integer> func = no -> no*5;
		
		System.out.print(func.apply(5));
	}
}

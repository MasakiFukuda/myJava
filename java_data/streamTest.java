import java.util.*;

import java.util.stream.*;

class streamTest{
	public static void main(String[] args){
		List<Integer> li = Arrays.asList(7,9,4,6,77,5,22,444,55,66);
		
		li.parallelStream().unordered().map(no -> no*5).forEach(no -> System.out.println(no));
	}
}

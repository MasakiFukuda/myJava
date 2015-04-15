import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Test{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("first_name","FUKUDA");
		map.put("last_name","MASAKI");
		
		Set keySet = map.entrySet();
		Iterator itr = keySet.iterator();
		while(itr.hasNext()){
			String key = (String)itr.next();
			System.out.println(key+" "+map.get(key));
		}
	}
}

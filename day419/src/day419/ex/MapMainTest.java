package day419.ex;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MapMainTest {
		//트리맵 연습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap();
		tmap.put(1, "Hi");
		tmap.put(2, "Hello");
		tmap.put(3, "Hello");
		
		//map은 Iterator을 사용할 수없다 그래서 set으로 변환시켜서 구현을 함
		//그리고 그걸 가능하게 하는게 entrySet이다 set이기 떄문에 iterator이 가능하다
		Iterator it = tmap.entrySet().iterator();
		while(it.hasNext()) {
			
			Map.Entry<Integer, String>
			map = (Map.Entry<Integer, String>)
			it.next();
			String value = map.getValue();
			int key = map.getKey();
			System.out.print("key:"+key);
			System.out.println(",value :" + value);
		}
		//스택
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.pop(); //맨위의 값을 뺴온다. 스택은 위에서만 뽑기떄문에
	
		for(int i = 0; i<10; i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+ " ");
		}
		
	}

}

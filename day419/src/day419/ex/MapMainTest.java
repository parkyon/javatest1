package day419.ex;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MapMainTest {
		//Ʈ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap();
		tmap.put(1, "Hi");
		tmap.put(2, "Hello");
		tmap.put(3, "Hello");
		
		//map�� Iterator�� ����� ������ �׷��� set���� ��ȯ���Ѽ� ������ ��
		//�׸��� �װ� �����ϰ� �ϴ°� entrySet�̴� set�̱� ������ iterator�� �����ϴ�
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
		//����
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.pop(); //������ ���� ���´�. ������ �������� �̱⋚����
	
		for(int i = 0; i<10; i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+ " ");
		}
		
	}

}

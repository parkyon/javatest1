package day419.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class arrytest {
///Arrylist �׽�Ʈ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList(); //Ŭ������ �ֱ� ���� Interger�� �ִ´�.
		al.add(10);
		al.add(20);
		al.add(10);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.remove(0);
		System.out.println("============");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		


		//LinkedList
		
		LinkedList<Integer> ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("--------------");
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("-----------------");
		Iterator it = ll.iterator();//�ݸ� for �Ⱦ��� �̰� �ᵵ��
		while(it.hasNext()) {
			int i =  (Integer)it.next();
			System.out.println(i);
		}
		
		
		Vector<Integer> v = new Vector();
		v.capacity();   //��ü �迭�� ������ �����Ѱ�
		v.size();
		
	}

}

import java.util.*;
public class queue{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<>();
		//operations q.add() ,q.offer()
		//q.remove(),q.poll();
		//q.peek();
		
		
		q.add(1);
		q.add(2);
		q.add(5);
		q.add(9);
		q.add(4);
		q.remove(4);
		/*System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.remove(4));		
		System.out.println(q);
		System.out.println(q.contains(23));   */
		for(Integer i:q){
			System.out.println(i);
		}
	};
}

package interval;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 
 * Merge overlapping intervals.
 * 
 * @author gouthr
 * 
 *         To sort a collection of any object, one of the following must be
 *         true:
 * 
 *         The object must implement Comparable. In this case, implement
 *         Comparable<Interval>. Then Collections.sort will be able to sort using
 *         the compareTo method. 
 *         
 *         Create your own class that implements
 *         Comparator, specifically Comparator<Interval>, and pass an instance of
 *         that class as the second parameter to Collections.sort. Then the
 *         sorting algorithm will use the Comparator to sort the collection.
 *
 */

public class OverlappingInterval {
	private static Stack<Interval> st = new Stack<Interval>();
	
	public static void mergeOverlappingIntervals(Interval[] arr) {
		// Arrays.sort(arr); // Using Interval implemented Comparable
		
		Arrays.sort(arr, new IntervalComparator()); // Using IntervalComparator
		
		st.push(arr[0]);
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i].start > st.peek().end) {
				st.push(arr[i]);
			} else {
				if (arr[i].end > st.peek().end) {
					Interval top = st.pop();
					top.end = arr[i].end;
					st.push(top);
				}
			}
		}		
	}
	
	public static void printOverlappingIntervals() {
		while(!st.isEmpty()) {
			Interval node = st.pop();
			System.out.println("Interval start: " + node.start + " , interval end: " + node.end);
		}
	}
	
	public static void main(String[] args) {
		Interval node1 = new Interval(1, 5);
		Interval node2 = new Interval(1, 2);
		Interval node3 = new Interval(7, 9);
		Interval node4 = new Interval(2, 7);
		Interval node5 = new Interval(2, 5);
		Interval node6 = new Interval(5, 6);
		Interval node7 = new Interval(11, 15);
		
		List<Interval> list = Arrays.asList(node1, node2, node3, node4, node5, node6, node7);
		
		mergeOverlappingIntervals((Interval[]) list.toArray());
		printOverlappingIntervals();
	}
}

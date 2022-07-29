package assignment.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> arrayList1 = new ArrayList<Integer>();
		for (int i : array1)
			arrayList1.add(i);
		List<Integer> arrayList2 = new ArrayList<Integer>();
		for (int i : array2)
			arrayList2.add(i);
		arrayList1.retainAll(arrayList2);
		System.out.println("Duplicates:" + arrayList1);
	}

}

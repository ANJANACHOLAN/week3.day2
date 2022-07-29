package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split("");
		Set data = new LinkedHashSet<String>(Arrays.asList(split));

		List<String> list1 = new ArrayList<String>(data);// converting set to list
		System.out.println(list1);
		for (int i = 0; i < (list1.size() - 1); i++) {
			if (list1.get(i) == list1.get(i + 1)) {
				System.out.println(list1.get(i));
			}

		}
	}

}

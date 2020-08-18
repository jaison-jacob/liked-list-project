package interview;

import java.util.ArrayList;
import java.util.List;

public class addingprocess {
	List<Integer> data = new ArrayList<Integer>();
	storage head = null;
	storage tail = null;

	// adding the object
	public void add(storage object) {

		if (head == null) {
			head = object;
			tail = object;
		} else {
			storage temp = head;
			head = object;
			head.next = temp;
		}

	}

	// result process
	public void result() {
		storage current = head;
		if (head == null) {
			System.out.println("storage is empty");
		}

		while (current != null) {
			if (current.symbol.equals("1") || current.symbol.equals("0")) {
				int convert = Integer.parseInt(current.symbol);
				data.add(convert);

			}

			current = current.next;
		}
		int count = 0;
		int total = 0;
		int val = 1;
		for (int j = 0; j < data.size(); j++) {

			count = j;

			if (count == 0) {
				total = (1 * data.get(j));
			} else {
				for (int i = 0; i < count; i++) {

					val *= 2;

				}
				total = total + val * data.get(j);
				val = 1;

			}
		}
		System.out.println("binary result");
		System.out.println(total);
	}

	public void viweaddestring() {
		storage current = head;
		if (head == null) {
			System.out.println("storage is empty");
		}
		System.out.println("String List");
		while (current != null) {

			System.out.println(current.symbol);
			current = current.next;
		}
	}
}

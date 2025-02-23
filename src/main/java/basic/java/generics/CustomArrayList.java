package basic.java.generics;
import java.util.*;

//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
public class CustomArrayList {

	private int[] data;
	private static int DEFUALT_SIZE = 10;
	private int size = 0;

	public CustomArrayList() {
		this.data = new int[DEFUALT_SIZE];
		this.size = size;
	}

	public void add(int num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	private boolean isFull() {
		return size == data.length;
	}

	private void resize() {
		int[] temp = new int[data.length * 2];
		// copy the current item in the array new
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(14);
		list.add(6);
		list.add(7);
		list.remove(0);
		System.out.println(list);
	}

}

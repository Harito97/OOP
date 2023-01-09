package com.iterator;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
	private ArrayList<String> items;
	private int position;
 
	public MyListIterator(ArrayList<String> items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		/* TODO */
		if (hasNext()){
			return items.get(position + 1);
		}
		return "";
	}
 
	public boolean hasNext() {
		/* TODO */
		return position < items.size() - 1;
	}
}

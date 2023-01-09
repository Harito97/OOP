package com.iterator;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		/* TODO */
		if (hasNext()){
			return items[position + 1];
		}
		return "";
	}
 
	public boolean hasNext() {
		/* TODO */
		return position < items.length - 1;
	}
}

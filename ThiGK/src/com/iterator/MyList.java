package com.iterator;

import java.util.ArrayList;

public class MyList implements MyIterable {
	private ArrayList<String> menuItems;
 
	public MyList() {
		menuItems = new ArrayList<String>();
	}

	public void addItem(String name) {
		this.menuItems.add(name);
	}
 
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		/* TODO */
		MyListIterator result = new MyListIterator(menuItems);
		return (Iterator) result;
	}
  
	public String toString() {
		/* TODO */
		String result = "MyList[" + menuItems.get(0);
		for (int i = 1; i < this.menuItems.size(); i++){
			result += " " + menuItems.get(i);
		}
		return result;
	}
}

package com.iterator;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {
		if (numberOfItems <= 0 || numberOfItems > 6){
			System.out.println("Can't add.");
			return;
		}
		menuItems[numberOfItems - 1] = name;
	}
 
	public String[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		MyArrayIterator result = new MyArrayIterator(menuItems);
		return (Iterator) result;
		//return null;
	}
 
	public String toString() {
		String result = "MyArray[" + menuItems[0];
		for (int i = 1; i < this.menuItems.length; i++){
			result += " " + menuItems[i];
		}
		return result;
	}
}

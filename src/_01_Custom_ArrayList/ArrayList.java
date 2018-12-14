package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object arr [];
	public ArrayList() {
		arr= new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return (T) arr[loc];
	}
	
	public void add(T val) {
		Object arr2[]= new Object [arr.length+1];
		
		arr2[arr.length]= val;
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i]= arr[i];
		}
		
		arr= arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object arr3[]= new Object[arr.length+1];
		
		for (int i = 0; i < arr3.length; i++) {
			if (i<loc) {
				arr3[i]=arr[i];
			}
			else if (i>loc) {
				arr3[i]= arr[i-1];
			}
			else {
				arr3[i]=val;
				
			}
		}
		arr= arr3;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object arr4 []= new Object[arr.length-1];
		
		for (int i = 0; i < arr.length; i++) {
			if (i<loc) {
				arr4[i]=arr[i];
			}
			else if (i>loc) {
				arr4[i-1]= arr[i];
			}
		}
		arr=arr4;
	}
	public int size() {
		return arr.length;
		
		
	}
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==val) {
				return true;
			}
		}
		return false;
	}
}
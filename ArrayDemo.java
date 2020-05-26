package Introduction;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] myIntArray1;
		myIntArray1 = new int[10];
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		
		System.out.println("0 index :"  + myIntArray1[0]);
		System.out.println("1 index :"  + myIntArray1[1]);
		System.out.println("2 index :"  + myIntArray1[2]);
		
	String[] myStringArray1 = {"bmw", "Audi", "Honda"};
		//String[] myStringArray1 = {"bmw", "audi", "honda"};
		
		System.out.println("0 index :"  + myStringArray1[0]);
		System.out.println("1 index :"  + myStringArray1[1]);
		System.out.println("2 index :"  + myStringArray1[2]);
		
		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;
		
		System.out.println("int Array Length:" + len1);
		
		
		
		int[] myIntArray2;
		myIntArray2 = new int[20];

		myIntArray2[0] = 200;
		myIntArray2[1] = 100;

		System.out.println("0 index:" + myIntArray2[0]);
	}
}


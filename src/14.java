import java.util.*;
public class MyRandom {
	public static void main(String[] args) {
		int[] myArray = new int[10];
		for (int i=0; i<myArray.length; i++) {
			myArray[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(myArray));
	}
}
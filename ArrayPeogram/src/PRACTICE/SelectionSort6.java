package PRACTICE;
import java.util.Arrays;
public class SelectionSort6 {
	public static void main(String[] args) {
		int a[]= {25,5,90};
		for(int i =0;i<a.length-1;i++) {
			int minIndex=i;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp =a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}

package Nov22;

public class GratestElementOfAnArray {
public static void main(String[] args) {
	int a[]= {12,1,5,2,65};
	int gratest =a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>gratest) {
			gratest=a[i];
		}
	}
	System.out.println(gratest);
}
}

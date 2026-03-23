package org.eclipse;

public class palandrome {
public static void main(String[] args) {
	int i= 121;
	int rev=0;
	int temp = i;
	while(i!=0) {
		int digit=i%10;
		rev=digit+rev*10;
		i=i/10;
	}
	if(temp==rev) {
		System.out.println("it is palandrome");
		
	}
	else {
		System.out.println("it not palandrome");
	}
}
}

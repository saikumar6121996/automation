package org.eclipse;

public class Asend {
public static void main(String[] args) {
	
	int arr[]= {1,2,8,3,2,5,6,5};

	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		System.out.println(arr[i]);
	}
	
	
	
for(int i=0;i<arr.length;i++) {
	boolean isduplicate=false;
	for(int j=0;j<i;j++) {
		if(arr[i]==arr[j]) {
			isduplicate=true;
			break;
		}
	}
	if(!isduplicate) {
		//System.out.println(arr[i]);
		arr[i]=arr[i];
	}
	
}



}
}


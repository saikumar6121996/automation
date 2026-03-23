package org.eclipse;

public class Assendingorder {
	
	    public static void main(String[] args) {

	        int arr[] = {5,2,2,4,6,6,2,3,1,8};

	        // Step 1: Sort the array (Ascending order)
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i] > arr[j]){
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                    
	                }
	            }
	            
	        }
	        
	        

	        // Step 2: Remove duplicates
	        for(int i=0;i<arr.length;i++){

	            boolean isDuplicate = false;

	            for(int j=0;j<i;j++){
	                if(arr[i]==arr[j]){
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if(!isDuplicate){
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	}

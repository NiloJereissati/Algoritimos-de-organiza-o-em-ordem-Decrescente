package bubble;

public class Main{
	static void bubble(int[] arr) {
		int n = arr.length;
		int aux = 0;
		for(int i = 0; i < n; i++) {
			for(int j= 1;j < n;j++) {
				if(arr[j-1] < arr[j]) {
					aux = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = aux;  
					
				}
			}
			
		}
		
	}
	
	public static void main(String[]args) {
		int arr[] ={3,42,24,2,45,69,5};                                
        bubble(arr); 
        
        for(int i=0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");  

        }
        
	}
	
	
	
}

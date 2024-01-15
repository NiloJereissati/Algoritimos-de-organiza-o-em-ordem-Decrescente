import java.util.Arrays;

public class insertionsortDecr {
	public static void insertionsort(int[] arr) {
		for(int j=1; j<arr.length; j++) {
			int chave = arr[j];
			int i=j-1;
			
			while(i>=0 && arr[i]<=chave) {
				arr[i+1] = arr[i];
				i--;
				System.out.println(Arrays.toString(arr));
			arr[i+1] = chave;
			System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	public static void main(String[] args) {
		//vetor de teste
		int[] vet = {5,2,7,4,1,6,9};
		
	
		//print antes
		System.out.println(Arrays.toString(vet)); 
		
		//faz insertionsort
		insertionsort(vet);
	}
}

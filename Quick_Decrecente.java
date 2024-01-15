import java.util.Arrays;


public class quicksortDecr {
	public static void main(String[] args) {
		//vetor de teste
		int[] vet = {5,2,7,4,1,6,9};
		
	
		//print antes
		System.out.println(Arrays.toString(vet)); 
		
		//faz quicksort
		quicksort(vet,0,(vet.length-1));

		//print depois
		System.out.println(Arrays.toString(vet));
	}

	
	//QUICKSORT
	public static void quicksort(int[] arr, int idPrim, int idUlt) {
		if(idPrim<idUlt) {
			int idPivo = partition(arr,idPrim,idUlt); //obtem pos do pivo
			
			//chamadas recursivas
			quicksort(arr,idPrim,idPivo-1);
			quicksort(arr,idPivo+1,idUlt);
		}
	}

	//PARTITION
	public static int partition(int[] arr, int idPrim, int idUlt) {
		int pivo = arr[idUlt]; //pivo recebe ultimo valor
		int i = idPrim-1; //iterador
		
		//percorre 'j'
		for(int j = idPrim;j<idUlt;j++) {
			if(arr[j]>=pivo) {
				i++; //'i' anda
				
				//troca arr[i] e arr[j]
				int aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
				
				//print
				System.out.println(Arrays.toString(arr));			}
		}
		i++; //um passo final do i, para a troca com o pivo
		
		//troca do pivo
		int aux = arr[i];
		arr[i] = arr[idUlt];
		arr[idUlt] = aux;
		
		//print
		System.out.println(Arrays.toString(arr));
		
		//retorno
		return i;
	}
}

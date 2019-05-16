
public class test2 {
	
	public static void main(String args[]){
 		
		int temp;
		int arr[] ={0,1,2,0,1,2,0,1,2,0};
		
		//int arr[] = {4,5,9,2,6,1};
		
		int n= arr.length;
		
		
		for (int i=0; i<n; i++)
		{
			
			for (int j = i+1; j<n; j++){
				
			
			if (arr[i] > arr[j]){
				
				temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				
			}
			
		}
	}
			
		for (int i=0;i<n; i++){
			
			System.out.println(arr[i]);
		}
		
		
		
	}

}

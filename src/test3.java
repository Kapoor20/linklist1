import java.util.Arrays;

//Count number of occurrences (or frequency) in a sorted array
public class test3 {
	
	public static void main(String[] args) {
		
	
	
	int temp;
	//int arr[] ={0,1,2,0,1,2,0,1,2,0};
	
	int iArr[] = {4,5,9,2,6,1,4,13,2,5,5,9,2,2,4};
	
	int n= iArr.length;
	
	int input=2;
	
	int index= Arrays.binarySearch(iArr, 13);
    
System.out.println(index);

	}

}

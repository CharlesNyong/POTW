import java.util.*;
/*TODO:
 * read input from user or find out how this is suppose to be read*/

public class Problem_1 {
	
	public static int[] removeDuplicate(int[] array){
		HashSet<Integer> list = new HashSet<Integer>();
		int[] returnVal = new int[array.length];
		for(int i =0; i<array.length; i++){
			list.add(array[i]);
		}
		
		for(int i =0; i<list.size(); i++){
			returnVal[i] = (Integer)list.toArray()[i];
		}
		
		
		return returnVal;
	}
	
	public static int NumOfUniquePairs(HashMap<Integer, Integer> list){
		int NumOfKey = list.keySet().size();
		int count = NumOfKey + NumOfKey;
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] Input = new int[n];
		for(int i =0; i<n; i++){
			Input[i] = reader.nextInt();
		}
		int NumOfPairs = reader.nextInt(); // number of unique holes to pair
		int sum = reader.nextInt(); // ultimate sum to be checked
		Input = removeDuplicate(Input);
		
		int pairCounter = 0;
		int i =0, j = (i+1);
		for(i = 0; i < Input.length; i++){
			for(j =(i+1); j< Input.length; j++){
				if((Input[i] + Input[j]) == sum){
					pairCounter +=2;
				}
			}
		}
		
	
		 //System.out.println("pairCounter = " + pairCounter);
		if(pairCounter == NumOfPairs){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
	}

}

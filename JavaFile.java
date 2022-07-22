import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Concatenation_of_Array {

	public static void main(String[] args) {
//		int[] arr = {1,2,1}
//		System.out.println(Arrays.toString(getConcatenation(arr)));
		
		
		
//		int[] arr = {2,5,1,3,4,7};
//		int n = arr.length/2;
//		shuffle(arr,n);
		
		
		
		int[] candies = {4,2,1,1,2};
		int extracandies = 1;
		System.out.println(kidsWithCandies(candies, extracandies));
		
		

	}
//	static int[] getConcatenation(int[] nums) {
//        int[] arr = new int[nums.length*2];
////        System.out.println(arr.length);
//        for(int i=0; i<nums.length;i++) 
//        {
//        	arr[i]=nums[i];
//        }
//        for(int i=1; i<=nums.length;i++) 
//        {
//        	arr[nums.length-1+i]=nums[i-1];
//        }
//        
//        return arr;
//    }
//	static int[] shuffle(int[] nums, int n) {
//        int[] arrcopy = new int[nums.length];
//        int a=0,k=n;
//        for(int i=0 ; i<n*2; i++)
//        {
//            arrcopy[i] = nums[a];
//            a++;i++;
//        }
//        // System.out.println(Arrays.toString(arrcopy));
//        for(int i =1; i<n*2; i++)
//        {
//            arrcopy[i] = nums[k];
//            k++;i++;
//        }
//        return arrcopy;
//    }
	
	
//	                                    Kids With the Greatest Number of Candies
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int[] added_Candies = new int[candies.length];
		int sum = 0;
		List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length;i++)
        {
            sum = candies[i] + extraCandies;
            for(int j =0;j<candies.length; j++) 
            {
            	if(sum>=candies[j]) 
            	{
            		if(j==candies.length-1) {result.add(i, true);break;}
            		continue;
            	}
            	
            	else {
            		result.add(i, false);;
            		break;
            	}
            }
        }
        return result;
        
       
    }

}

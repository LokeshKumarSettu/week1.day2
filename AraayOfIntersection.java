package week1.day2;

public class AraayOfIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare An array for {3,2,11,4,6,7};
		int arr1[]={3,2,11,4,6,7};
		
		//Declare another array for {1,2,8,4,9,7};
		int arr2[]={1,2,8,4,9,7};
		
		// Declare for loop iterator from 0 to array length
			for(int i=0;i<arr1.length;i++)
		{
			//Declare a nested for another array from 0 to array length
			for(int j=0;j<arr2.length;j++)
			{
				
				// Compare Both the arrays using a condition statement
				if(arr1[i]==arr2[j])
					System.out.println("The intersected element are" +arr1[i]);
			}
		}

	}

}

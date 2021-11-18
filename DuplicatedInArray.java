package week1.day2;

public class DuplicatedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,12,13,11,15,14,18,16,17,17,18,19,20};
		System.out.println("The duplicate in the array is");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}

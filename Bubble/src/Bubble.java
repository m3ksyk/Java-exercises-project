
public class Bubble {

	public static void main(String[] args) {
		int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
	int a, b, t, size;
	
	size = 10;
	
	//wyswietlenie oryginalnej tabeli
	System.out.println("original array: ");
	for(int i=0; i < size; i++)
	System.out.print(" " + nums[i]);
	System.out.println();
	
	//sortowanie babelkowe tabeli
	for(a=1; a < size; a++)
		for(b=size - 1; b>=a; b--) {
	if(nums[b-1] > nums[b])	{
		//wymiana elementów
		t = nums[b-1];
	nums[b-1] = nums[b];
	nums[b] = t;
 	
	}
	}
System.out.print("Sorted array: ");
for(int i=0; i<size; i++)
	System.out.print(" " + nums[i]);
}}

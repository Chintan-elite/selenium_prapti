package a03_array;

public class A003_arrayOpration {
	public static void main(String[] args) {
		
		
		int a[] = {10,200,30,40,50,60};
//		int sum = 0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum = sum + a[i];
//		}
//		
//		System.out.println("Sum is : "+sum);
//		System.out.println("avg is : "+(sum/a.length));
//		
		
		int max = a[0]; 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("max : "+max);
		
		
		
		int min = a[0]; 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				max = a[i];
			}
		}
		
		System.out.println("min :"+min);
		
		
		
	}
}

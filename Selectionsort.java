
public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]=new int[6];
   a[0]=1;
   a[1]=5;
   a[2]=6;
   a[3]=7;
   a[4]=3;
   a[5]=2;
   int minindex;
   for(int i=0;i<=a.length-2;i++)
   {
	   minindex=i;
	   for(int j=i+1;j<=a.length-1;j++)
	   {
		   if(a[j]<a[minindex])
		   {
			   minindex=j;
		   }
	   }
	   int temp;
	   temp=a[minindex];
	   a[minindex]=a[i];
	   a[i]=temp;
   }
   System.out.println("The Sorted elements are");
   for(int k=0;k<=a.length-1;k++)
   {
	   System.out.println(a[k]);
   }
	}

}

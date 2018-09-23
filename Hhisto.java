import java.io.*;
class Hhisto{
	public static void main(String args[]){
		int i,j,n;
		int arr[]=new int[10];
		Console con=System.console();
		System.out.println("enter values in a array");
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(con.readLine());
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println(" Horizontal Histrogram ");
		for(i=0;i<10;i++)
		{	while(arr[i]>0)
			  {
				System.out.print("*");
				--arr[i];
			  }
			System.out.println();
		}
	}
}
			
		
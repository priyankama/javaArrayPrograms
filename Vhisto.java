import java.io.*;
class Vhisto{
	public static void main(String args[]){
		int i,j,n,max=0;
		int arr[]=new int[10];
		Console con=System.console();
		System.out.println("Enter values in a array ");
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(con.readLine());
		System.out.println("Your array");
		for(int x:arr)
			System.out.print(x+" ");
		max=arr[0];
		for(i=1;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("max no is "+max);
		int a=max;
		System.out.println("VERTICAL HISTOGRAM:::");
		for(i=0;i<a;i++){
			for(j=0;j<10;j++){
				if(arr[j]<max)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		max--;
		System.out.println();
		}
	}
}
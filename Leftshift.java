import java.io.*;
class Leftshift{
	public static void main(String args[]){
		int i,n;
		int arr[]=new int[10];
		Console con=System.console();
		System.out.print("Enter Values ");
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(con.readLine());
		for(int x:arr)
			System.out.print(" "+x);
		System.out.print("Enter position to shift array ");
		n=Integer.parseInt(con.readLine());
		for(i=0;i<(10-n);i++)
			arr[i]=arr[i+n];		
		for(i=(10-n);i<=9;i++)
			arr[i]=0;
		System.out.println("shifted array");
		for(int y:arr)
			System.out.print(y);
	}
}
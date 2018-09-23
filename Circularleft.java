import java.io.*;
class Circularleft{
	public static void main(String args[]){
		int i=0,a=0,n;
		int arr[]=new int[10];
		Console con=System.console();
		System.out.print("Enter Values ");
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(con.readLine());
		for(int x:arr)
			System.out.print(" "+x);
		System.out.print("Enter position to shift array ");
		n=Integer.parseInt(con.readLine());
		while(n>0){
		        int t=arr[0];
			for(int j=0;j<9;j++)
		        	arr[j]=arr[j+1];
			arr[9]=t;
			--n;		
		}System.out.println("shifted array");
		for(int y:arr)
			System.out.print(y+" ");
	}
}
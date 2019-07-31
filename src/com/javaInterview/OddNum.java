package com.javaInterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OddNum {
	
	 static int[] oddNumbers(int l, int r) {
		 int arraySize = 1;
		 int[] arr = new int[arraySize];
		 int i = 0;
		 while(i<=arraySize)
		 {
			 if(l%2 == 1 && l<=r)
			 {
					 arr[i] = l; 
					 i++; 
					 arraySize++;
			 }
			 
			 l++;

		 }
		 
		 return arr;
		 
	 }
public static void main(String[] args) throws IOException  {
// TODO Auto-generated method stub

Scanner in =new Scanner(System.in);
final String fileName =System.getenv("OUTPUTPATH");
//BufferedWriter bw = new BufferedWriter(new FileWriter(fileName) );
int[]res;
int _l;
_l = Integer.parseInt(in.nextLine().trim());
int _r;
_r = Integer.parseInt(in.nextLine().trim());

res = oddNumbers(_l,_r);
for(int res_i=0; res_i <res.length; res_i++) {
//bw.write(String.valueOf(res[res_i]));
//bw.newLine();
System.out.println(res[res_i]);
}
//bw.close();
		
	}

}

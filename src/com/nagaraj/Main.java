
package com.nagaraj;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class Box{
	int width, height, depth;
	Box(int w,int h, int d)
	{
		this.width = w;
		this.height = h;
		this.depth = d;
		
	}
	void printVolume()
	{
		System.out.print("Volume is ");
		System.out.println(this.width*this.height*this.depth);
	}
	int getVolume()
	{
		return this.width*this.height*this.depth;
		
	}
}

public class Main {

	

	  public static void main(String[] args) throws IOException {
		  
		  Box b1 = new Box(10,12,13);		  
		  Box b2 = b1;
		  
  		  
		  //b1.printVolume();
		  int v = b1.getVolume();
		  System.out.println("Volume from box is "+v);
		  //System.out.println(b1.width+" "+b2.width);
		  
		  //System.out.println(b1.width+" "+b2.width);
		
		  /*
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	  
	    String[] inputs;
	    String inputText ="1024,1024,80";
	    //System.out.println(inputText);
	    //Split the inputs and get x y v
	    inputs = inputText.split(",",0);
	    int x = Integer.parseInt(inputs[0]);
	    int y = Integer.parseInt(inputs[1]);
	    int v = Integer.parseInt(inputs[2]);
	  
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(v);
	    */
		  
	  }
	

}

//Java program to count total number of files in a directory(unable to do the count of distinct files)
package implementation;

import java.io.File;

public class directory {
	  public static void main(String[] args) {

		    File directory = new File("C:\\Users\\jayos");
		    int fileCount=directory.list().length;
		    System.out.println("File Count:"+fileCount);
		  }
		}
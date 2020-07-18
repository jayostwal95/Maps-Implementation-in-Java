//Java Program to display jpeg files from directory
package implementation;
import java.io.*;

public class FindFilesWithThisExtn {
	
	private static final String fileLocation = "C:\\Users\\jayos\\Downloads";
	//for jpeg
	private static final String searchThisExtn = ".jpeg";

	public static void main(String args[]) {
		FindFilesWithThisExtn obj = new FindFilesWithThisExtn();
		obj.listFiles(fileLocation, searchThisExtn);
	}

	public void listFiles(String loc, String extn) {

		SearchFiles files = new SearchFiles(extn);

		File folder = new File(loc);

		if(folder.isDirectory()==false){
			System.out.println("Folder does not exists: " + fileLocation);
			return;
		}

		String[] list = folder.list(files);

		if (list.length == 0) {
			System.out.println("There are no files with " + extn + " Extension");
			return;
		}

		for (String file : list) {
			String temp = new StringBuffer(fileLocation).append(File.separator)
					.append(file).toString();
			System.out.println("file : " + temp);
		}
	}

	public class SearchFiles implements FilenameFilter {

		private String ext;

		public SearchFiles(String ext) {
			this.ext = ext;
		}
		
		@Override
		public boolean accept(File loc, String name) {
			if(name.lastIndexOf('.')>0)
            {
               // get last index for '.' 
               int lastIndex = name.lastIndexOf('.');
               
               // get extension
               String str = name.substring(lastIndex);
               
               // matching extension 
               if(str.equalsIgnoreCase(ext))
               {
                  return true;
               }
            }
            return false;
			
		}
	}
	

}

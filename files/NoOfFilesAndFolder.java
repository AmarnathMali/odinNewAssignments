package files;

import java.io.File;

public class NoOfFilesAndFolder {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filesCount=0;
		int folderCount=0;
		String location = "C:/Users/admin/OneDrive/Desktop/odinSchool/Odin_CoreJava_InClass/src/InClassExample/";
        File fileObj = new File(location);
        String noOfAllItems[] = fileObj.list();
        for(String str : noOfAllItems) {
        	String individual = location.concat(str);
        	File file = new File(individual);
        	if(file.isFile()) {
        		filesCount++;
        	}else {
        		folderCount++;
        	}
        }
        System.out.println(noOfAllItems.length);
        System.out.println("no of files"+ filesCount);
        System.out.println("no of folder"+ folderCount);
	}

}

package com.chainsys.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileOperations {

	public static void main(String[] args) throws IOException {
	//createNewFile();
	//renameFile();
	//appendDataToFile();
	//modifyDataInFile();
	readDataFromFile();
	//deleteFile();
	//copyFile();
	//moveFile();
	}
    public static void  createNewFile() throws IOException
    {
         java.util.Scanner scanner=new java.util.Scanner (System.in);
            String filename="";
            String source = "";
            try {
            System.out.println("Enter FileName with full path"); 
            filename = scanner.nextLine();
            System.out.println("Enter the Datas in the file");
            source = scanner.nextLine();
           
            } 
            finally 
            {
            scanner.close();
            }
            char buffer[] = new char [source.length ()]; 
            source.getChars (0, source.length(), buffer, 0); 
            FileWriter fw =null;
           
            try
            {
            fw = new FileWriter (filename);
            for (int i=0; i < buffer.length; i++) {
                
                fw.write(buffer[i]);
                }
                System.out.println("Datas Saved in the file");
                } catch (Exception err)
                {
                err.printStackTrace();
                }
                finally
                {
                fw.close();
                }
    }

    public static void  renameFile()
    {
    	File file = new File("d:\\Assignment\\Rajan.txt");
    	File rename = new File("d:\\Assignment\\Raj.txt");
    	boolean flag = file.renameTo(rename);
    	if ( flag == true) {
    		System.out.println("File successfully Renamed.......");    		
    	}
    	else {
    		System.out.println("Operation failed!!!");
    	}
    }

    public static void appendDataToFile() throws IOException
    {
        String path ="d:\\Raj.txt";
        String texttojoin = "\n Apple Inc. is an American multinational technology company that specializes in "
        		+ "\nconsumer electronics, software and online services. Apple is the largest information "
        		+ "\ntechnology company by revenue (totaling US$365.8 billion in 2021) and as of January 2021.";
        System.out.println("Data Appended to the file...........");
    
    try
    {
        Files.write(Paths.get(path), texttojoin.getBytes(),StandardOpenOption.APPEND);
    
    }
    catch (IOException err)
    {
        System.out.println(err);
    }
    }

    public static void  modifyDataInFile() throws IOException
    {
          String file="d:\\Rajan.txt";
          java.util.Scanner i=new java.util.Scanner(new File(file));
          StringBuffer buffer =new StringBuffer();
          while(i.hasNextLine()) {
              buffer.append(i.nextLine()+System.lineSeparator());
          }
          String Datasinthefile =buffer.toString();
          System.out.println(" DATAs in the file: "+Datasinthefile);
          i.close();
          String existingWord="Apple";
          String newWord="Orange";
          Datasinthefile =Datasinthefile.replace(existingWord, newWord);
          FileWriter writer=new FileWriter(file);
          System.out.println("");
          System.out.println("After Modifying the file (Datas changed) :"+Datasinthefile);
          writer.append(Datasinthefile);
          writer.flush();
    
    }    
   
    public static void readDataFromFile() throws IOException
{
	int charfromfile;
    FileInputStream fin=null;
    String fname="d:\\Raj.txt";
    try
    {
        fin=new FileInputStream(fname);
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File Not Found");
        return;
    }
    //checking if data is available
    try
    {
        System.out.println("IsData Available "+fin.available());
    }
    catch(IOException e)
    {
        System.out.println("File is closed"+e.getMessage());
    }
    //reading data from the file
    try
    {
        do
        {
            charfromfile=fin.read();
            if(charfromfile != -1)
            System.out.print((char)charfromfile);
        }while(charfromfile != -1); 
    }
    catch(IOException e)
    {
            System.out.println("Error in read"+e.getMessage());
    }
    finally
        {
            try
            {
                if (null!=fin)  fin.close();
            }catch(IOException e1)
            {
                System.out.println(e1.getMessage());
            }
        }
    
}

    public static void deleteFile() {
    	File file = new File ("d:\\testfile.txt");
    	if(file.delete())
    	{
    		System.out.println("File deleted successfully...");
    	}
    	else 
    	{
    		System.out.println("Failed to delete the file!!!");
    	}
    }
   
    public static void copyFile() throws IOException
   {
        
        FileInputStream fis =null ;
        FileOutputStream fos = null;
        try {
           fis = new FileInputStream("d:\\Assignment\\Raj.txt");
            fos = new FileOutputStream("d:\\Assignment\\Rajan.txt"); 
            int c;
            while ((c = fis.read()) != -1) 
            {
                fos.write(c);
            }
 
            System.out.println("File copied successfully ");
        }
 
        finally {
           if (fis != null) 
            {
                fis.close();
            }
            if (fos != null) 
            {
                fos.close();
            }
        }  
        }  

    public static void moveFile() throws IOException

    {
        
        {
            Path temp = Files.move
            (Paths.get("d:\\Assignment\\Rajan.txt"),
                       Paths.get("d:\\Temp\\raj.txt"));
     
            if(temp != null)
            {
                System.out.println("File renamed and moved successfully ");
            }
            else
            {
                System.out.println("Failed to move the file");
            }
        }
    }
    
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr= new ArrayList<String>();
        String file1 = "C:\\scanned72.dat";
        //reading   
        try{
        	
        	File f = new File(file1);
            InputStream ips=new FileInputStream(file1); 
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String line;
            while ((line=br.readLine())!=null){
              arr.add(line+"\n");
            }
            br.close(); 
            System.out.print(arr);
        	
        }       
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
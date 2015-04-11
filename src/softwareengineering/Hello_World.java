package softwareengineering;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Hello_World {

	
	  public static void main(String[] args) throws IOException {
		  HashMap<Integer,HashMap<String,String>> hmCSV = new HashMap<Integer, HashMap<String,String>>();
		 
		  
		  File csvData = new File("/project/softwareengineering/work/test_csv.txt");
		  try {
		  CSVParser parser = CSVParser.parse(csvData, Charset.defaultCharset(), CSVFormat.newFormat(';'));
		  for (CSVRecord csvRecord : parser) {
			  for (String field : csvRecord) {
		          System.out.print("\"" + field + "\", ");
		      }
		      System.out.println();
		  }
		  } catch (Exception e) {
			  e.printStackTrace();
			  System.out.println("FEHLER, ABER EGAL, WIR ARBEITEN TROTZDEM WEITER...");
			}
		  csvData = new File("/projects/softwareengineering/work/test_csv.txt");
		  try {
		  CSVParser parser = CSVParser.parse(csvData, Charset.defaultCharset(), CSVFormat.newFormat(';'));
		  int zeile=0;
		  CSVRecord ueberschriftenRecord = null;
		  for (CSVRecord csvRecord : parser) {
			  zeile++; 
			  if (zeile == 1) {
				  ueberschriftenRecord = csvRecord;
			  } else {
			  HashMap<String,String> zeilenWerte = new HashMap<String, String>();
			  int c = 0;
			  for (String field : csvRecord) {	
				  zeilenWerte.put(ueberschriftenRecord.get(c), field);
				  c++;
		          System.out.print("\"" + field + "\", ");
		      }
			  hmCSV.put(zeile-1, zeilenWerte);
		      System.out.println();
			  }
		  }
		  } catch (Exception e) {
			  e.printStackTrace();
			  System.out.println("FEHLER, ABER EGAL, WIR ARBEITEN TROTZDEM WEITER...");
			}
		  System.out.println(hmCSV.get(2).get("c"));
		  BufferedWriter writer = null;
		  File outputFile = new File("/projects/softwareengineering/work/output.txt");
		  writer = new BufferedWriter(new FileWriter(outputFile, true));
		  String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
          writer.write(timeLog + "\n");
          writer.write("Hello world!\n");
          writer.write(hmCSV.get(2).get("c"));
          writer.write("\n");

		  writer.close();
		  Reader in = new StringReader("a;b;c");
		  try {
			for (CSVRecord record : CSVFormat.newFormat(';').parse(in)) {
			      for (String field : record) {
			          System.out.print("\"" + field + "\", ");
			      }
			      System.out.println();
			  }
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.exit(1);
		}
		  
		  
		  HashMap<String,String> hm = new HashMap<String, String>();
		  hm.put("KEY1", "Test");
		  hm.put("KEY2", "Test4");
		  
		  HashMap<String,Integer> hmConfiguration = new HashMap<String, Integer>();
		  for (int i = 0; i < 20; i++) {
			  hmConfiguration.put("KEY" + i, i);
		  }
		  hmConfiguration.put("KEY2", 400);
		  
		  
		  System.out.println(hm.get("KEY2"));
		  
		     List<Integer> list = new ArrayList<Integer>();
		   	 Random random = new Random();
		   	 for (int i = 0; i < hmConfiguration.get("KEY2"); i++) {
		   		 Integer z = random.nextInt(2000);
		   		 list.add(z);
		   		 System.out.println(list.size() + ": " + z);
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 //System.out.println(list.get(300-1));
		   	 for (int i = 0; i < 500; i++) {
		   		 System.out.println((i+1) + ": " + list.get(i));
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 System.out.println();
		   	 while (list.size() > 0) {
		   		 int index_of_lowest_value = 0;
		   		 for (int i = 1; i < list.size(); i++) {
		   			 if (list.get(i) < list.get(index_of_lowest_value)){
		   			 index_of_lowest_value = i;
		   		 }
		   		 }
		   			 System.out.println(index_of_lowest_value + ": " + list.get(index_of_lowest_value));
		   			 list.remove(index_of_lowest_value);
		   		 
		   	 }
		   	 
		   	 
		   	 //System.exit(0);
		   	 
		   	 String variable_string = "String Wert";
		   	 System.out.println(variable_string);
		   	 int i = 100;
		   	 System.out.print(i + " ");
		   	 double d = 22.5;
		   	 System.out.print(d + " ");
		   	 i = (int) d;
		   	 System.out.print(i + " ");
		   	 String v = "hallo " + i;
		   	 System.out.println();
		   	 for (int j = 1; j <= 10; j++) {
		   		 System.out.print(j);
		   		 if ((j == 3) || (j == 5) || (j == 7) || (j == 9)) {
		   			 System.out.println();
		   		 }
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 for (int j = 1; j <= 10; j++) {
		   		 if (j % 2 == 0) {
		   			 System.out.println(j);
		   		 } else {
		   			 System.out.print(j);
		   		 }
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 // array 0 1 2 zahl mit der man auf die einzelnen werte zugreife kann.
		   	 // bezieht sich auf die jeweils untere zahl
		   	 String[] s = { "abc", "def", "efg" };
		   	 System.out.println(s[0]);
		   	 System.out.println(s[1]);
		   	 System.out.println(s[2]);
		   	 System.out.println();
		   	 System.out.println();
		   	 for (int j = 0; j <= 2; j++) {
		   		 System.out.println(s[j]);
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 // nächste schleife foreach
		   	 for (String string : s) {
		   		 boolean b = string.contains("b");
		   		 //boolean b2 = string.startsWith("e"); ka warum
		   		 System.out.println(b);
		   		 if ("abc".equals(string)) {
		   			 System.out.println(string);
		   		 }
		   	 }
		   	 System.out.println();
		   	 System.out.println();
		   	 System.out.println("Random Wert:");
		   	 //random wert von 0 bis .. in diesem fall 1000
		   	 Random r = new Random();
		   	 //r.setSeed(100);
		   	 while (i !=1) {
		   		 i = r.nextInt(1000);
		   		 System.out.println(i);
		   		 try {
		   			 Thread.sleep(10); //system wartet angegebene zeitspanne bis es wietermacht. (in millisekunden)
		   		 } catch (InterruptedException e) {
		   			 
		   			 e.printStackTrace();
		   		 }
		   	 }
		   	 //System.out.println(r.nextInt(1000));
		   	 System.out.println();
		   	 System.out.println();
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 // datentypen: String, Integer, boolean, double, long
		   	 System.exit(0); // return
		    }
		}

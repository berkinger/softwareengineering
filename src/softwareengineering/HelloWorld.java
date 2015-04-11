package softwareengineering;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class HelloWorld {

	

		public static void main(String[] args) {

           List<Integer> list = new ArrayList<Integer>();
           Random random = new Random();
           for (int i = 0; i < 500; i++) {
			Integer z = random.nextInt(2000);
			list.add(z);
			System.out.println(list.size() + ": " + z);
			
		}
		   System.out.println(list.get(300-1));
		   for (int i = 0; i < 500; i++) {
			   System.out.println((i+1) + ": " + list.get(i));
		   }
		   System.out.println("------------------------");
		   
		   while (list.size() > 0) {
			int index_of_lowest_value = 0;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < list.get(index_of_lowest_value)) {
					index_of_lowest_value = i;
				}
			}
			//System.out.println(index_of_lowest_value + ":" + list.get(index_of_lowest_value));
			System.out.println(list.get(index_of_lowest_value));
			list.remove(index_of_lowest_value);
		}
		   
		   
           System.exit(0);
			
			
			
			// djfkalsdjfldasfkdsjfladsjfaskj
			// kommentarzeilen

			// datentypen
			String variable_string = "String-Wert";
			System.out.println(variable_string);
			int i = 100;
			System.out.print(i);
			double d = 22.5;
			System.out.print(d);
			i = (int)d;
			System.out.print(i);
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(j);
				if ((j == 3) || (j == 5) || (j == 7)) {
					System.out.println();
				}
			}
			for (int j = 1; j <= 10; j++) {
				if (j % 2 == 0) {
					System.out.println(j);
				} else {
					System.out.print(j);
				}
				System.out.print(j);
				if ((j == 3) || (j == 5) || (j == 7)) {
					System.out.println();
				}
				//j--;
			}
			String[] s = { "abc", "defb", "efg" };
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s[2]);
			for (int j = 0; j <= 2; j++) {
				System.out.println(s[j]);
			}
			for (String string : s) {
				boolean b = string.contains("b");
				boolean b2 = string.startsWith("e");
				System.out.println(b);
				if (b) {
					
				}
				if ("abc".equals(string)) {
				  System.out.println(string);
				}
			}
			Random r = new Random();
			//r.setSeed(100);
			System.out.println(r.nextInt(1000));
			
			
			
			
			
			System.exit(0);
			
			System.out.println("Hello world! I'm Christoph.");
			
			Date n = new Date();
			n.setHours(5);
			System.out.println(n.getHours() + " " + n.getMinutes());
		    
		    
			System.out.println("Hello world! I'm Christoph.");
			System.out.println("Hello world! I'm Christoph.");
		    
		}

	
}

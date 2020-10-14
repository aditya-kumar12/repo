import java.util.StringTokenizer;  


public class StringTokenizerDemo{  
 public static void main(String args[]){  
	 
	 //Xyz;13131231;54353453;abc st, 4232;
	 /*String str = "Xyz;13131231;54353453;abc st, 4232;";
	 int index = str.indexOf(";");
	 System.out.println(str.substring(0, index));
	 */
	 

   StringTokenizer st = new StringTokenizer(
		   "This;institute;name;is;some;institute",";");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken()); 
     }  
   }  
}
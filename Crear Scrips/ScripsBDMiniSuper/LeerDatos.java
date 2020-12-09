import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos{
    public static final String SEPARATOR=";";
    public static final String QUOTE="\"";
   
   public static void main(String[] args) {
      
      BufferedReader br = null;
      
      try {
         
         br =new BufferedReader(new FileReader("C:/Users/aleja/Desktop/Nombres.csv"));
         String line = br.readLine();
         while (null!=line) {
            String [] fields = line.split(SEPARATOR);
            System.out.println(Arrays.toString(fields));
            
            fields = removeTrailingQuotes(fields);
            System.out.println(Arrays.toString(fields));
            
            line = br.readLine();
         }
         
      } catch (Exception e) {
         System.err.println("Error! "+e.getMessage());
      } finally {
         if (null!=br){
            try {
               br.close();
            } catch (IOException e) {
               System.err.println("Error closing file !! "+e.getMessage());
            }
         }
      }
      
   }

    private static String[] removeTrailingQuotes(String[] fields) {
      String result[] = new String[fields.length];
      for (int i=0;i<result.length;i++){
         result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
      }
      return result;
   }
}

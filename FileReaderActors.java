import java.util.*;
import java.io.*;

public class FileReaderActors{ 
   public static void main (String[]args)throws IOException{      
   
      File f = new File("actors.tsv");
      Scanner s = new Scanner(f);
      PrintStream p = new PrintStream("actors2.txt");
      
      
      while(s.hasNext()){
      
      
         String nconst = s.next();
         String fornavn = s.next();
         String efternavn = s.next();
         String f�dsel = s.next();
         String d�d = s.next();
         String kendtFor = s.next();
         String iFilm = s.next();
         
          /*System.out.println("nconst : "+nconst);
         System.out.println("fornavn: "+fornavn);
         System.out.println("efternavn: "+efternavn);
         System.out.println("f�dt: "+f�dsel);
         System.out.println("d�d: "+d�d);
         System.out.println("kendt for: "+kendtFor);
         System.out.println("I film: "+iFilm); */
         p.printf("%s   %s   %s   %s   %s", fornavn, efternavn, f�dsel, d�d, iFilm);
         p.println();

      
      
      }
      




   }
}
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
         String fødsel = s.next();
         String død = s.next();
         String kendtFor = s.next();
         String iFilm = s.next();
         
          /*System.out.println("nconst : "+nconst);
         System.out.println("fornavn: "+fornavn);
         System.out.println("efternavn: "+efternavn);
         System.out.println("født: "+fødsel);
         System.out.println("død: "+død);
         System.out.println("kendt for: "+kendtFor);
         System.out.println("I film: "+iFilm); */
         p.printf("%s   %s   %s   %s   %s", fornavn, efternavn, fødsel, død, iFilm);
         p.println();

      
      
      }
      




   }
}
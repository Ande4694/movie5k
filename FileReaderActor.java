import java.util.*;
import java.io.*;

public class FileReaderActor{ 
   public static void main (String[]args)throws IOException{      

      /// reader og re-writer til actors    
      File f = new File("actors.tsv");
      Scanner s = new Scanner(f);
      PrintStream p = new PrintStream("actors.txt");
      // " \N " fucker med vores code fordi vores code leder efter noget f�r en int.. 
      // derfor k�rer vi f�rst igennem programmet og s�ger efter \N og laver det om til 999
      
      while(s.hasNext()){
      
         String mellemnavn;
         String efternavn;
      
         String nconst = s.next();
         String fornavn = s.next();
         if(s.hasNextInt()){
            efternavn = "";
         }else{
            efternavn = s.next();
         }
         
         if(!s.hasNextInt()){
            mellemnavn = efternavn;
            efternavn = s.next();
            efternavn = mellemnavn+"_"+efternavn;
         }
         String f�dsel = s.next();
         String d�d = s.next();
         String kendtFor = s.next();
         String iFilm = s.next();
         
         p.printf("%s   %s   %s   %s   %s", fornavn, efternavn, f�dsel, d�d, iFilm);
         p.println();

      
      
      }
      

     


   }

}
import java.util.*;
import java.io.*;

public class FileReaderActor{ 
   public static void main (String[]args)throws IOException{      

      /// reader og re-writer til actors    
      File f = new File("actors.tsv");
      Scanner s = new Scanner(f);
      PrintStream p = new PrintStream("actors.txt");
      // " \N " fucker med vores code fordi vores code leder efter noget før en int.. 
      // derfor kører vi først igennem programmet og søger efter \N og laver det om til 999
      
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
         String fødsel = s.next();
         String død = s.next();
         String kendtFor = s.next();
         String iFilm = s.next();
         
         p.printf("%s   %s   %s   %s   %s", fornavn, efternavn, fødsel, død, iFilm);
         p.println();

      
      
      }
      

     


   }

}
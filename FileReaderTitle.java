import java.util.*;
import java.io.*;

public class FileReaderTitle{

   public static void main (String[]args)throws IOException{
   
    ///read from title
      File f = new File("title.tsv");
      Scanner sc = new Scanner(f);
      PrintStream p = new PrintStream("title2.txt");
      System.out.print(sc.next());
      while (sc.hasNext()){
      
      String titleId = sc.next();  // bruges
      System.out.println(titleId);
      int ordering = sc.nextInt();
      String title = sc.next();  // bruges
      // fortsæt med at proppe ind i title til hasNExt() er i uppercase
      /// title op til 10 ord
      String test = sc.next();
      String region = "";
      if((test).equals(test.toUpperCase())){
         region = sc.next();
      }else{
         title = title+" "+test;
      }
      // boolean hasLowercase = !password.equals(password.toUpperCase());
      // if(!hasUppercase)System.out.println("Must have an uppercase Character");
      
      String language = sc.next();
      String types = sc.next();
      String attributes = sc.next();
      String originalTitle = sc.next();
      
      p.printf("%s   %s", titleId, title);
      p.println();
      
      
      }
   
   
   }

}
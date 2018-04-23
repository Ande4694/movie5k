import java.util.*;
import java.io.*;

public class FileReaderTitle{

   public static void main (String[]args)throws IOException{
   
    ///read from title
      File f = new File("title.txt");
      Scanner sc = new Scanner(f);
      PrintStream p = new PrintStream("title2.txt");
      while (sc.hasNext()){
      /*
      id
      ordering
      title
      region
      language
      type
      attribute
      original
      */
      String titleId = sc.next();  // bruges
      System.out.println("titleID: "+titleId);
      int ordering = sc.nextInt();
      System.out.println("ordering: "+ordering);
      String title = sc.next();  // bruges
      // fortsæt med at proppe ind i title til hasNExt() er i uppercase
      /// title op til 10 ord
      String test1 = sc.next();
      String region = "";
      if((test1).equals(test1.toUpperCase())){
         region = sc.next();
      }else{
         title = title+" "+test1;
      }
      String test2 = sc.next();
      if((test2).equals(test2.toUpperCase())){
         region = sc.next();
      }else{
         title = title+" "+test2;
      }
      System.out.println("title: "+title);
      System.out.println("region: "+region);
      String language = sc.next();
      System.out.println("language: "+language);
      String types = sc.next();
      System.out.println("types: "+types);
      String attributes = sc.next();
      System.out.println("attributes: "+attributes);
      String original = sc.next();
      System.out.println("original: "+original);

      p.printf("%s   %s", titleId, title);
      p.println();
      
      
      }
   
   
   }

}
import java.util.*;
import java.io.*;

public class Movies{

private String id;
private String title;
private String region;

ArrayList<Movies> allMovies = new ArrayList<Movies>();

   public void getMovies()throws IOException{
      File f = new File("title2.txt");
      Scanner s = new Scanner(f);
      while(s.hasNext()){
         id = s.next();
         title = s.next();
         region = s.next();
         for(int i = 0; i<=10; i++){
            if ((region).equals(region.toUpperCase())){
               region = region;
            } else {
               title = title+" "+region;
               region = s.next();
            } 
         }
      }
   }


}
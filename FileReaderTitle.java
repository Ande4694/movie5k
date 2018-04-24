import java.util.*;
import java.io.*;

public class FileReaderTitle{
public static void main (String[]args)throws IOException{
      ///read from title
      File f = new File("title.txt");
      Scanner sc = new Scanner(f);
      PrintStream p = new PrintStream("title2.txt");
      while (sc.hasNext()){

      String id = sc.next(); // vigtigt
      //System.out.println("id: "+id);
      String order = sc.next();
      //System.out.println("order: "+ order);
      String title = sc.next(); // vigtigt
      
      
      String region = sc.next();
      if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title+" "+region;
         region = sc.next();
      } 
      
      
      if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } if ((region).equals(region.toUpperCase())){
         region = region;
      } else {
         title = title + " " +region;
         region = sc.next();
      } 
      
      //System.out.println("title: "+title);
      //System.out.println("region: "+region);
      String language = sc.next();
      //System.out.println("language: "+language);
      String type = sc.next();
      //System.out.println("type: "+type);
      String attr = sc.next();
      if(sc.hasNextInt()){
         String original = sc.next();
      } else {
         attr = attr+" "+sc.next();
      }
      //System.out.println("attributes: "+attr);
      //String original = sc.next();
      //System.out.println("original: "+original);
      if(id.contains("tt")){
         p.printf("%s     %s     %s",id, title, region);
         p.println();
      }
      }
      
System.out.println("done");

}
}
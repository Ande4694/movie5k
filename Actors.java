import java.util.*;
import java.io.*;

public class Actors{

private String firstName;
private String lastName;
private int born;
private String dead;
private String isInMovies;
private String name = firstName+" "+lastName;


ArrayList<Actors> allActors = new ArrayList<Actors>();

   public void getActors()throws IOException{
      File f = new File("actors.txt");
      Scanner s = new Scanner(f);
      while(s.hasNext()){
         firstName = s.next();
         lastName = s.next();
         born = s.nextInt();
         dead = s.next();
         if(dead.equals("000")){
            dead = "Alive";
         }
         isInMovies = s.next();
      }
   }
   
   public String searchName(String search){
      for(int i = 0; i<allActors.size();i++){
         if(name.contains(search)){
            return name;
         } else {
            System.out.println("Name: "+search+" was not found");
         }
      }
      return "";
   }
   
   public String searchActsInMovie(String search){
      for(int i = 0; i<allActors.size();i++){
         if(isInMovies.contains(search)){
            return name;
         } else {
            System.out.println("Movie: "+search+" was not found");
         }
      }
      return "";
   }
}
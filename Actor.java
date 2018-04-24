import java.util.*;
import java.io.*;

public class Actor{

private int born;
private String dead;
private String isInMovies;
private String name;
private Movies movie;

   public Actor(String firstName, String lastName, String isInMovies){
      name = firstName+" "+lastName;
      this.isInMovies = isInMovies;
   }

   
   public String getName(){
      return name;
   }
   
   public String getMovies(){
      return isInMovies;
   }
   
   
}
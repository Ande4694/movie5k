import java.util.*;
import java.io.*;

public class Movies{

   private String id;
   private String title;
   private String region;
   private Actor actor;


   public Movies(String id, String title, String region){
      this.id = id;
      this.title = title;
      this.region = region;
   }
   
   public String getTitle(){
      return title;
   }
   
   public String getId(){
      return id;
   }

}
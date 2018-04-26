import java.io.File;
public class Customer{


   private String username;
   private String password;


   
   Customer (String username, String password){
      this.username = username;
      this.password = password;
   }
   
   public String getUsername(){
      return username;
   }
   
   public String getPassword(){
      return password;
   }
   
   
}
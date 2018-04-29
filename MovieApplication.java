import java.util.*;
import java.io.*;

public class MovieApplication{

   private static MovieList movieList = new MovieList();  
   private static Scanner scan = new Scanner(System.in);   
   private static boolean admin = false;
   
   public static void main(String[] args)throws IOException{
   
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      login1();
      
      printInstructions();
     
      while (choice){
      
         option = antiJarl();
             
         switch(option){
            
            case 0: 
               printInstructions();
               break;
            
            case 1:
               movieList.printMovieList();
               printInstructions(); 
               break;
            
            case 2:
               addMovie();
               printInstructions();
               break;
            
            case 3:
               modifyMovie();
               printInstructions();
               break;
               
            case 4:
               removeMovie();
               printInstructions();
               break;
            
            case 5:
               searchMovie();
               printInstructions();
               break;
            
            case 6:
               playMovie();
               printInstructions();
               break;
               
            case 7:
               if(admin){
                  viewStats();
                  printInstructions();
               }else{
                  System.out.println("Admin only feature");
                  printInstructions();
               }
               break;
                  
            case 9:
               choice = false;
               break;
                  
         }
      }
   }
   
   public static void printInstructions(){
      System.out.println("\nPress ");
      System.out.println("\t 0 - Print instructions.");
      System.out.println("\t 1 - Print your favorite movie list.");
      System.out.println("\t 2 - Add a movie to your favorite movie list.");
      System.out.println("\t 3 - Modify a movie.");
      System.out.println("\t 4 - Remove movie from your list.");
      System.out.println("\t 5 - Search for movie.");
      System.out.println("\t 6 - Play movie.");
      if(admin){
         System.out.println("\t 7 - Watched movies.");
      }
      System.out.println("\t 9 - Quit.");
   } 
   
   public static void addMovie(){
      System.out.print("Please enter movie title: ");
      movieList.addMovie(scan.nextLine());
   }
   
   public static void modifyMovie(){
      System.out.print("Enter movie number: ");
      int movieNo = antiJarl();
      scan.nextLine();
      System.out.print("Enter new movie: ");
      String newMovie = scan.nextLine();
      movieList.modifyMovieItem(movieNo-1, newMovie);
   }
   
   public static void removeMovie(){
      System.out.print("Enter movie number: ");
      int movieNo = antiJarl();
      scan.nextLine();
      movieList.removeMovie(movieNo-1);
   }
   
   public static void viewStats()throws IOException{
      Scanner scan = new Scanner((new File("stats.txt")));
      ArrayList<String> stats = new ArrayList<String>();
      while(scan.hasNextLine()){
         String movie = scan.nextLine();
         if(!stats.contains(movie)){
            stats.add(movie);
         } 
      }
      System.out.println(stats);
   }
   
   
   public static void playMovie()throws IOException{
      Scanner sc = new Scanner(System.in);
      File f = new File("titleFinal4.txt");
      Scanner fs = new Scanner(f);
      PrintStream stats = new PrintStream("stats.txt");
      
      System.out.print("Type movie id to play:");
      String typedId=sc.next();      
      while (fs.hasNext()){
         String id = fs.next();
         String title = fs.next();
         String region = fs.next();
         for(int i = 0; i<=10; i++){
            if ((region).equals(region.toUpperCase())){
               region = region;
            } else {
               title = title+" "+region;
               region = fs.next();
            }         
         }
         if(id.equals(typedId)){
            System.out.println("Now playing: "+title);
            stats.append(title);
            stats.println();
         }
      }
   
      File fa = new File("actors.txt");
      Scanner s = new Scanner(fa);
      String actors = "";
      while(s.hasNext()){
         String firstName = s.next();
         String lastName = s.next();
         String name = firstName+" "+lastName;
         String isInMovies = s.next();
         if(isInMovies.contains(typedId)){
            actors = actors+", "+name;
         }
      }
      System.out.println("Actors in this movie: "+actors);
    
   }
   
   public static void searchMovie()throws IOException{
      Scanner sc = new Scanner(System.in);
      File f = new File("titleFinal.txt");
      Scanner fs = new Scanner(f);
      System.out.print("Search for title:");
      String searchTitle=sc.nextLine(); 
      String match = "";     
      while (fs.hasNext()){
         String id = fs.next();
         String title = fs.next();
         String region = fs.next();
         for(int i = 0; i<=10; i++){
            if ((region).equals(region.toUpperCase())){
               region = region;
            } else {
               title = title+" "+region;
               region = fs.next();
            }
         }
         if(title.contains((searchTitle.toLowerCase()))){
            match = match+"["+title+" - id: "+id+"]";
         }
      }
      System.out.println("matches: "+match);
   }  
   
   public static void restart()throws IOException{
      main(new String[0]);
   }
   
   public static void login1() throws IOException{
      String username;
      String password; 
   
      Customer loggedInUser = null;
      boolean admin;
      admin = false;
        
      Customer[] listOfCustomers = new Customer[6];       
        
      listOfCustomers[0] = new Customer("Thomas","1234");
      listOfCustomers[1] = new Customer("Anders","7894");
      listOfCustomers[2] = new Customer("Jonathan","1337");
      listOfCustomers[3] = new Customer("Gustav","3396");
      listOfCustomers[4] = new Customer("Admin","1");
        
   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
      Scanner input = new Scanner(System.in);
        
       
      System.out.println("*** Welcome to Grp. 5000 Netfox ***\n");
        
      menuPromptStart();
   
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer; try again.\nNice try Jarl...");
      }
   
      int choice; 
      do{
         choice = input.nextInt();
         switch(choice){
         
            case 1:
               break;
         
            case 2:
            
               while (choice !=5000){
                  System.out.println("To Create an account you must type a username and a password\n");
                  System.out.println("Please type a Username :");
                  String Username = input.next();
                  System.out.println("please type a password :");
                  String Password = input.next();
                  System.out.println("please type password again :");
               
               
                  if(Password.equals(input.next())){
                     System.out.println("Credentials Accepted.");
                     listOfCustomers[5] = new Customer(Username,Password);
                     choice = 5000;
                  }
                  else{
                     System.out.println("Password did not match, try again.");
                  }
               
               }
            
            
               System.out.println("Account created!\n");
               menuPromptStart();
               break;
         
            case 0:
               System.out.println("Have a nice day!");
               System.exit(0);
               break;
         
            default:
               System.out.println("Not an integer; try again.");
               break;
         
         }
      }while(choice !=1);
         
         
   
      System.out.println("Please type your Username* :");
      username = br.readLine();   
      System.out.println("Please type your Password* :");
      password = br.readLine();
   
      try{
         for (Customer user : listOfCustomers)
         {
         
            if (user.getUsername().equals(username))
            {
               
               if (user.getPassword().equals(password))
               {
                    
                  loggedInUser = user;
                  if (loggedInUser == listOfCustomers[4]){
                     admin = true;
                  }
               
                  break;
               }
            }
         }
      }catch(Exception e){
         System.out.println("Password did not match, try again.");
      }
   
      if (loggedInUser != null)
      {
         System.out.println("User successfully logged in: "+loggedInUser.getUsername());
      }
        
      else
      {
         System.out.println("Invalid username or password");
         MovieApplication.restart();
      }
   }
   
   public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("2: Create Account");
      System.out.println();
      System.out.println("0: Exit");
   }
   
   public static int antiJarl(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer, try again Jarl..");
      }
      return input.nextInt();
      
   }
   
   public static void antiJarlCustom(String text){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println(text);
      }
   }
}
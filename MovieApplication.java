import java.util.*;
import java.io.*;

public class MovieApplication{

private static MovieList movieList = new MovieList();  
private static Scanner scan = new Scanner(System.in); 
private static ArrayList<Movies> allMovies = new ArrayList<Movies>();
private static ArrayList<Actor> allActors = new ArrayList<Actor>();
private static Movies movie;
private static Actor actor;

  
   
   public static void main(String[] args)throws IOException{
   
   String password;
   String username;
   boolean choice = true;
   int option;
   Scanner scan = new Scanner(System.in);
   printInstructions();
     
      while (choice){
        // System.out.println("Welcome to the Movie Application.\nPlease login or create an account to continue.");
        // System.out.println("1. Login or 2. Create account");
         option = scan.nextInt();
        // scan.nextLine(); 
             
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
               choice = false;
               break;
         }
      }
   }
   
   public static void printInstructions(){
      System.out.println("\nPress ");
      System.out.println("\t 0 - Print instructions.");
      System.out.println("\t 1 - Print the movie list.");
      System.out.println("\t 2 - Add a movie to the list.");
      System.out.println("\t 3 - Modify a movie.");
      System.out.println("\t 4 - Remove movie from list.");
      System.out.println("\t 5 - Search for movie.");
      System.out.println("\t 6 - Play movie.");
      System.out.println("\t 7 - Quit.");
   } 
   
   public static void addMovie(){
      System.out.print("Please enter movie title: ");
      movieList.addMovie(scan.nextLine());
   }
   
   public static void modifyMovie(){
      System.out.print("Enter movie number: ");
      int movieNo = scan.nextInt();
      scan.nextLine();
      System.out.print("Enter new movie: ");
      String newMovie = scan.nextLine();
      movieList.modifyMovieItem(movieNo-1, newMovie);
   }
   
   public static void removeMovie(){
      System.out.print("Enter movie number: ");
      int movieNo = scan.nextInt();
      scan.nextLine();
      movieList.removeMovie(movieNo-1);
   }
   
   public static void searchForMovie(){
      System.out.print("Movie to search for: ");
      String searchMovie = scan.nextLine();
      if(movieList.findMovie(searchMovie) != null){
         System.out.println("Found " + searchMovie + " in our movie list.");
      }else{
         System.out.println(searchMovie + " is not on the movie list.");
      } 
   }
   
   public static void fillAllMovies()throws IOException{
      File f = new File("titleFinal.txt");
      Scanner s = new Scanner(f);
      while(s.hasNext()){
         String id = s.next();
         String title = s.next();
         String region = s.next();
         for(int i = 0; i<=10; i++){
            if ((region).equals(region.toUpperCase())){
               region = region;
            } else {
               title = title+" "+region;
               region = s.next();
            } 
         }
         Movies movie = new Movies(id, title, region);
         allMovies.add(movie);
         
      }
   }
   
   public static void fillAllActors()throws IOException{
      File f = new File("actors.txt");
      Scanner s = new Scanner(f);
      while(s.hasNext()){
         String firstName = s.next();
         String lastName = s.next();
         String isInMovies = s.next();   
         Actor actor = new Actor(firstName, lastName, isInMovies);
         allActors.add(actor);    
      }
   }
   
   public static String searchName(String search){
      for(int i = 0; i<allActors.size();i++){
         if(actor.getName().contains(search)){
            return actor.getName();
         } else {
            System.out.println("Name: "+search+" was not found");
         }
      }
      return "";
   }
  
   
   // play movie
   public static void playMovie()throws IOException{
      // scan
      Scanner sc = new Scanner(System.in);
      File f = new File("titleFinal4.txt");
      Scanner fs = new Scanner(f);
      
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
      // scan
      Scanner sc = new Scanner(System.in);
      File f = new File("titleFinal.txt");
      Scanner fs = new Scanner(f);
      System.out.print("Search for title:");
      String searchTitle=sc.next(); 
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
   
   
   // login
   

}
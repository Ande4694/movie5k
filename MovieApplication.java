import java.util.*;

public class MovieApplication{

private static MovieList movieList = new MovieList();  
private static Scanner scan = new Scanner(System.in);   
   
   public static void main(String[] args){
   
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
               searchForMovie();
               printInstructions();
               break;
               
            case 6:
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
      System.out.println("\t 6 - Quit.");
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
}
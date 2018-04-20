import java.util.*;

public class MovieList{
   
  private ArrayList<String> movieList = new ArrayList<>();

  public void addMovie(String item){
      movieList.add(item);
   }
   
  public void printMovieList(){
      System.out.println("You have " + movieList.size() + " movies in your movie list.");
      for(int i=0; i<movieList.size(); i++){
         System.out.println((i+1) + ". " + movieList.get(i));
      }
   }
   
  public void modifyMovieItem(int position, String newMovie){
      movieList.set(position, newMovie);
      System.out.println("Movie " + (position+1) + "has been modified.");
   }
   
  public void removeMovie(int position){
      String theMovie = movieList.get(position);
      movieList.remove(position);
   }
   
  public String findMovie(String searchMovie){
//      boolean exists = movieList.contains(searchMovie);
         int position = movieList.indexOf(searchMovie);
         if(position >= 0){
            return movieList.get(position);
         }
         return null;
   }

}
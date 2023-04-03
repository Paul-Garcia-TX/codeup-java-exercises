package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main (String[] args){

        System.out.println("Please select an option");
        System.out.println(" ~~~~~~~~~~~~ ");
        System.out.println(" 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view all movies in the drama category \n 4 - view all movies in the horror category \n 5 - view all movies in the scifi category");

        Scanner choice = new Scanner(System.in);

        int userchoice = choice.nextInt();

        System.out.println("Your choice: " + userchoice);

        Movie[] movies = MoviesArray.findAll();

        switch (userchoice){
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            case 1:
                for(Movie movie : movies) {
                    System.out.println(movie.getName());
                }
                break;
            case 2:
                for(Movie movie : movies){
                    if(movie.getGenre().equals("animated")){
                        System.out.println(movie.getName());
                    }
                }
                break;
            case 3:
                for(Movie movie : movies){
                    if(movie.getGenre().equals("drama")){
                        System.out.println(movie.getName());
                    }
                }
                break;
            case 4:
                for(Movie movie : movies){
                    if(movie.getGenre().equals("horror")){
                        System.out.println(movie.getName());
                    }
                }
                break;
            case 5:
                for(Movie movie : movies){
                    if(movie.getGenre().equals("scifi")){
                        System.out.println(movie.getName());
                    }
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}

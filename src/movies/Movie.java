package movies;

public class Movie {



    private String name;
    private String genre;

//    public Movie(String name, String genre) {
//    }

    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }


}

public class Movie {
    public String title;
    public String director;
    public int year;

    public Movie(String title, String director, int year){
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String toString(){
        return "Movie title: " + this.title +
            "\nDirector: "+ this.director +
            "\nYear: " + this.year;
    }
}

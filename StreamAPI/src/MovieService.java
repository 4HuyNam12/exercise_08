import java.util.LinkedList;

public class MovieService {
    public void listAll(LinkedList<Movie> list) {
        list.stream().forEach(movie -> System.out.println(movie));
    }

    public void listByView(LinkedList<Movie> list,int listSize) {
        list.stream().sorted((m1, m2) -> (int) (m2.getViewCount() - m1.getViewCount())).limit(listSize).forEach(movie -> System.out.println(movie));
    }

    public void listByCategory(LinkedList<Movie> list, CategoryEnum category) {
        list.stream().filter(movie -> movie.getCategory().equals(category)).forEach(movie -> System.out.println(movie));
    }

    public void listByGenres(LinkedList<Movie> list, String genre) {
        list.stream().filter(movie -> movie.getGenre().contains(genre)).forEach(movie -> System.out.println(movie));
    }
}

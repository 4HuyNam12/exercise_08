import java.text.DecimalFormat;

public class Movie {
    private int id;
    private String movieName;
    private String authorName;
    private String genre;
    private CategoryEnum category;
    private long viewCount;
    private int length;


    public Movie(int id, String movieName, String authorName, String genre, CategoryEnum category, int viewCount, int length) {
        this.id = id;
        this.movieName = movieName;
        this.authorName = authorName;
        this.genre = genre;
        this.category = category;
        this.viewCount = viewCount;
        this.length = length;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public long getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String formatView(long movieView) {
        DecimalFormat myformat = new DecimalFormat("###,###,###");
        return myformat.format(movieView);
    }

    @Override
    public String toString() {
        return id + " - " + movieName + " - " + authorName + " - " + genre + " - " + category + " - " + formatView(viewCount) + " - " + length;
    }
}

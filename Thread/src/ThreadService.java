import java.util.LinkedList;

public class ThreadService extends Thread{
    MovieReposỉtory repo = new MovieReposỉtory();
    LinkedList<Movie> allMovies = repo.listMovies();
    MovieService movieService = new MovieService(
    );
    @Override
    public void run() {
        System.out.println("Hiển thị tất cả các bộ phim:");
        movieService.listAll(allMovies);
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (i) {
                case 1 -> {
                    System.out.println("3 bộ phim có lượt xem cao nhất:\n ");
                    movieService.listByView(allMovies, 3);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Danh sách phim danh mục : Movie\n");
                    movieService.listByCategory(allMovies, CategoryEnum.MOVIE);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Danh sách phim theo danh mục : TV SHOW\n");
                    movieService.listByCategory(allMovies, CategoryEnum.TV_SHOW);
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Danh sách phim theo thể loại: Hành động.\n ");
                    movieService.listByGenres(allMovies, "Hành động");
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Danh sách phim theo thể loại: Kịch tính.\n");
                    movieService.listByGenres(allMovies, "Kịch tính");
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("Danh sách phim theo thể loại: Lãng mạn.\n ");
                    movieService.listByGenres(allMovies, "Lãng mạn");
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("Danh sách phim theo thể loại: Tình cảm.\n ");
                    movieService.listByGenres(allMovies, "Tình cảm");
                    System.out.println();
                }
                case 8 -> {
                    System.out.println("Danh sách phim theo thể loại: Xuyên không.\n ");
                    movieService.listByGenres(allMovies, "Xuyên không");
                    System.out.println();
                }
                case 9 -> {
                    System.out.println("Danh sách phim theo thể loại: Hài hước.\n ");
                    movieService.listByGenres(allMovies, "Hài hước");
                    System.out.println();
                }
                case 10 -> {
                    System.out.println("Thoát chương trình.");
                    System.exit(1);
                }
            }
        }
    }
}

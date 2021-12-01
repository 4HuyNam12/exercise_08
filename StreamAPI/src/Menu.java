import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    public void menuList() {
        Scanner sc = new Scanner(System.in);
        MovieReposỉtory repo = new MovieReposỉtory();
        LinkedList<Movie> allMovies;
        allMovies = repo.listMovie();
        MovieService movieService = new MovieService(
        );
        String pattern = "^[0-4]";
        String menu = """
                Mời bạn chọn chương trình
                1-Hiển thị tất cả các bộ phim
                2-Lấy ra 3 bộ phim có lượt xem cao nhất
                3-Liệt kê phim theo category
                4-Liệt kê phim theo thể loại
                0-Thoát chương trình""";
        boolean ischeck = false;
        String choice = null;
        do {
            System.out.println(menu);
            try {
                choice = sc.nextLine();
                if (!Pattern.matches(pattern, choice)) throw new Exception("Lựa chọn không đúng , vui lòng chọn lại!") ;
                ischeck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!ischeck);
        switch (choice) {
            case "1" -> {
                System.out.println("Hiển thị tất cả các bộ phim:");
                movieService.listAll(allMovies);
            }
            case "2" -> {
                System.out.println("3 bộ phim có lượt xem cao nhất: ");
                movieService.listByView(allMovies);}
            case "3" -> {
                System.out.println("Danh sách phim danh mục : Movie");
                movieService.listByCategory(allMovies,CategoryEnum.MOVIE);
                System.out.println();
                System.out.println("Danh sách phim theo thể loại : TV SHOW");
                movieService.listByCategory(allMovies,CategoryEnum.TV_SHOW);
            }
            case "4" ->{
                System.out.println("Danh sách phim theo thể loại: Hành động. ");
                movieService.listByGenres(allMovies,"Hành động");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Kịch tính.");
                movieService.listByGenres(allMovies,"Kịch tính");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Lãng mạn. ");
                movieService.listByGenres(allMovies,"Lãng mạn");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Tình cảm. ");
                movieService.listByGenres(allMovies,"Hài hước");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Xuyên không. ");
                movieService.listByGenres(allMovies,"Xuyên không");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Hài hước. ");
                movieService.listByGenres(allMovies,"Hài hước");
            }

        }

    }
}

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    public void menuList() {
        Scanner sc = new Scanner(System.in);
        MovieReposỉtory repo = new MovieReposỉtory();
        LinkedList<Movie> allMovies = new LinkedList<Movie>();
        allMovies = repo.listMovie();
        Service service = new Service(
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
                if (!Pattern.matches(pattern, choice)) throw new Exception() ;
                ischeck = true;
            } catch (Exception e) {
                System.out.println("Lựa chọn không đúng , vui lòng chọn lại!");
            }
        }while(!ischeck);
        switch (choice) {
            case "1" -> {
                System.out.println("Hiển thị tất cả các bộ phim:");
                service.listAllMovie(allMovies);
            }
            case "2" -> {
                System.out.println("3 bộ phim có lượt xem cao nhất: ");
                service.listByView(allMovies);}
            case "3" -> {
                System.out.println("Danh sách phim danh mục : Movie");
                service.listByCategory(allMovies,CategoryEnum.Movie);
                System.out.println();
                System.out.println("Danh sách phim theo thể loại : TV SHOW");
                service.listByCategory(allMovies,CategoryEnum.TV_Show);
            }
            case "4" ->{
                System.out.println("Danh sách phim theo thể loại: Hành động. ");
                service.listByGenres(allMovies,"Hành động");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Kịch tính.");
                service.listByGenres(allMovies,"Kịch tính");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Lãng mạn. ");
                service.listByGenres(allMovies,"Lãng mạn");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Tình cảm. ");
                service.listByGenres(allMovies,"Hài hước");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Xuyên không. ");
                service.listByGenres(allMovies,"Xuyên không");
                System.out.println();
                System.out.println("Danh sách phim theo thể loại: Hài hước. ");
                service.listByGenres(allMovies,"Hài hước");
            }

        }

    }
}

import java.util.LinkedList;

public class MovieRepository {
    public LinkedList<Movie> listMovies() {
        LinkedList<Movie> listMovie = new LinkedList<>();
        listMovie.add(new Movie(1, "Thợ săn quái vật", "Lauren Schmidt Hissrich", "Hành động,Kịch tính", CategoryEnum.MOVIE, 1200, 61));
        listMovie.add(new Movie(2, "Linh hồn đổi xác", "Laeta Kalogridis", "Kịch tính", CategoryEnum.MOVIE, 2000, 59));
        listMovie.add(new Movie(3, "Reply 1988", "Shin Won Ho", "Hài hước, Lãng mạn", CategoryEnum.MOVIE, 40000, 88));
        listMovie.add(new Movie(4, "Dream high", "Kim Seong Yun", "Lãng mạn", CategoryEnum.MOVIE, 100000, 65));
        listMovie.add(new Movie(5, "Full House", "Pyo Min Su", "Hài hước,Tình cảm", CategoryEnum.MOVIE, 20003, 40));
        listMovie.add(new Movie(6, "Love in the moonlight", "Kim Min Jeong", "Tình cảm", CategoryEnum.MOVIE, 60000, 70));
        listMovie.add(new Movie(7, "Hoàng tử gác mái", "Shin Yun Seob", "Xuyên không,Hài hước", CategoryEnum.MOVIE, 600112, 110));
        listMovie.add(new Movie(8, "Điên thì có sao", "Park Shin Woo", "Tình cảm", CategoryEnum.MOVIE, 31241, 75));
        listMovie.add(new Movie(9, "Prison Break", "Paul Scheuring", "Kịch tính,Hành động", CategoryEnum.MOVIE, 1000000, 44));
        listMovie.add(new Movie(10, "Chào tạm biệt mẹ", "Yu Je Won,Kwon Hye Joo", "Tình cảm", CategoryEnum.MOVIE, 65000, 74));
        listMovie.add(new Movie(11, "Bác sĩ thiên tài", "David Shore", "Kịch tính", CategoryEnum.TV_SHOW, 60030, 45));
        listMovie.add(new Movie(12, "Gambit Hậu", "Scott Frank,Allan Scott", "Kịch tính", CategoryEnum.TV_SHOW, 30000, 61));
        listMovie.add(new Movie(13, "Sóng ngầm", "Ludwig Simon,Luise Befort,Michelle Barthel", "Xuyên không", CategoryEnum.TV_SHOW, 14141, 111));
        listMovie.add(new Movie(14, "Sherlock", "Mark Gatiss,Steven Moffat", "Kịch tính,Hành động", CategoryEnum.TV_SHOW, 512515, 51));
        listMovie.add(new Movie(15, "Breaking Bad", "Vince Gilligan", "Hành động", CategoryEnum.TV_SHOW, 2000001, 51));
        return listMovie;
    }

}

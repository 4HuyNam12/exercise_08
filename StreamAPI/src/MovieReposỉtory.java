import java.util.LinkedList;
import java.util.List;

public class MovieReposỉtory {
    public LinkedList<Movie> listMovie() {
        LinkedList<Movie> listMovie = new LinkedList<>();
        listMovie.add(new Movie(1, "Thợ săn quái vật", "Lauren Schmidt Hissrich","Hành động,Kịch tính", CategoryEnum.Movie, 1200, 61));
        listMovie.add(new Movie(2, "Linh hồn đổi xác", "Laeta Kalogridis","Kịch tính", CategoryEnum.Movie, 2000, 59));
        listMovie.add(new Movie(3, "Reply 1988", "Shin Won Ho", "Hài hước, Lãng mạn",CategoryEnum.Movie, 40000, 88));
        listMovie.add(new Movie(4, "Dream high", "Kim Seong Yun","Lãng mạn", CategoryEnum.Movie, 100000, 65));
        listMovie.add(new Movie(5, "Full House", "Pyo Min Su", "Hài hước,Tình cảm",CategoryEnum.Movie, 20003, 40));
        listMovie.add(new Movie(6, "Love in the moonlight", "Kim Min Jeong","Tình cảm", CategoryEnum.Movie, 60000, 70));
        listMovie.add(new Movie(7, "Hoàng tử gác mái", "Shin Yun Seob", "Xuyên không,Hài hước",CategoryEnum.Movie, 600112, 110));
        listMovie.add(new Movie(8, "Điên thì có sao", "Park Shin Woo","Tình cảm", CategoryEnum.Movie, 31241, 75));
        listMovie.add(new Movie(9, "Prison Break", "Paul Scheuring", "Kịch tính,Hành động",CategoryEnum.Movie, 1000000, 44));
        listMovie.add(new Movie(10, "Chào tạm biệt mẹ", "Yu Je Won,Kwon Hye Joo","Tình cảm", CategoryEnum.Movie, 65000, 74));
        listMovie.add(new Movie(11, "Bác sĩ thiên tài", "David Shore","Kịch tính", CategoryEnum.TV_Show, 60030, 45));
        listMovie.add(new Movie(12, "Gambit Hậu", "Scott Frank,Allan Scott","Kịch tính", CategoryEnum.TV_Show, 30000, 61));
        listMovie.add(new Movie(13, "Sóng ngầm", "Ludwig Simon,Luise Befort,Michelle Barthel","Xuyên không", CategoryEnum.TV_Show, 14141, 111));
        listMovie.add(new Movie(14, "Sherlock", "Mark Gatiss,Steven Moffat","Kịch tính,Hành động", CategoryEnum.TV_Show, 512515, 51));
        listMovie.add(new Movie(15, "Breaking Bad", "Vince Gilligan","Hành động", CategoryEnum.TV_Show, 2000001, 51));
        return listMovie;
    }

}

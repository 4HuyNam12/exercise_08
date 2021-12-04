import java.util.ArrayList;

public class UserRepository {
    public ArrayList<User> listAll() {
        ArrayList<User> listAll = new ArrayList<>();
        listAll.add(new User("nam12", "formysadsong412@gmail.com", "Formysadsong_1"));
        listAll.add(new User("nam1992", "yennh6@gmail.com", "Yen@1235"));
        listAll.add(new User("yen11", "scoutxx2@gmail.com", "Nam@1234"));
        return listAll;
    }
}


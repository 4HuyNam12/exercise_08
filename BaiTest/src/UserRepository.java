import java.util.ArrayList;

public class UserRepository {

    public  ArrayList<User> listUsers(){
        ArrayList<User> listUsers = new ArrayList<>();
        listUsers.add(new User("nam1","formysadsong@gmail.com","Formysad_1"));
        listUsers.add(new User("nam2","scoutxx2@gmail.com","Scoutxx.1"));
        return listUsers;
    }

}

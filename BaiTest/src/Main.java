public class Main {
    public static void main(String[] args) {
        MenuList menu = new MenuList();
        UserRepository repo = new UserRepository();
            menu.menu(repo.listUsers());
        }
    }


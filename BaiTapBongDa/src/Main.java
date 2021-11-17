import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FormTeam formTeam = new FormTeam();
        TeamBuild teamBuild = new TeamBuild();
        PlayerRepository repository = new PlayerRepository();
        int randomChoice = teamBuild.usingRandom(1,4);
        switch (randomChoice) {
            case 1:
             ArrayList<Player> tatical1442=formTeam.setTactical(1,4,4,2);
                System.out.println("Danh sách cầu thủ sơ đồ 1-4-4-2");
                repository.printList(tatical1442);
                break;
            case 2:
                ArrayList<Player> tatical1433=formTeam.setTactical(1,4,3,3);
                System.out.println("Danh sách cầu thủ sơ đồ 1-4-3-3");
                repository.printList(tatical1433);
                break;
            case 3:
                ArrayList<Player> tatical1352=formTeam.setTactical(1,3,5,2);
                System.out.println("Danh sách cầu thủ sơ đồ 1-3-5-2");
                repository.printList(tatical1352);
                break;
        }
    }
}

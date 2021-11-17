import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TeamBuilding teamBuild = new TeamBuilding();
        PlayerRepository repository = new PlayerRepository();
        ArrayList<Player> allPlayers = repository.listPlayers();
        System.out.println("Danh Sách tất cả các cầu thủ: ");
        repository.printList(allPlayers);

        int randomChoice = teamBuild.usingRandom(1,4);
        switch (randomChoice) {
            case 1 -> {
                ArrayList<Player> tatical1442 = teamBuild.setTactical(1, 4, 4, 2);
                System.out.println("\nDanh sách cầu thủ sơ đồ 1-4-4-2");
                repository.printList(tatical1442);
            }
            case 2 -> {
                ArrayList<Player> tatical1433 = teamBuild.setTactical(1, 4, 3, 3);
                System.out.println("\nDanh sách cầu thủ sơ đồ 1-4-3-3");
                repository.printList(tatical1433);
            }
            case 3 -> {
                ArrayList<Player> tatical1352 = teamBuild.setTactical(1, 3, 5, 2);
                System.out.println("\nDanh sách cầu thủ sơ đồ 1-3-5-2");
                repository.printList(tatical1352);
            }
        }
    }
}

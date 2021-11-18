import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	PlayerRepository repo = new PlayerRepository();
        ArrayList<Player> allPlayers = repo.listPlayers();
        System.out.println("Danh sách tất cả cầu thủ: ");
        repo.printList(allPlayers);

    TeamBuilding buildTeam = new TeamBuilding();
    int randomChoice = buildTeam.useRandom(1,4);
        switch (randomChoice) {
            case 1 : ArrayList<Player> tatic1442 = buildTeam.selectPlayers(1,4,4,2);
                System.out.println("\nĐội hình theo sơ đồ 1 4 4 2 :");
                repo.printList(tatic1442);
                break;
            case 2 : ArrayList<Player> tatic1433 = buildTeam.selectPlayers(1,4,3,3);
                System.out.println("\nĐội hình theo sơ đồ 1 4 3 3 :");
                repo.printList(tatic1433);
                break;
            case 3 : ArrayList<Player> tatic1352 = buildTeam.selectPlayers(1,3,5,2);
                System.out.println("\nĐội hình theo sơ đồ 1 3 5 2 :");
                repo.printList(tatic1352);
                break;
        }
    }
}

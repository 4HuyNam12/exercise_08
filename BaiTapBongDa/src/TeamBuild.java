import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TeamBuild {
    PlayerRepository repo = new PlayerRepository();
    ArrayList<Player> allPlayers =repo.listPlayers();
    public int usingRandom(int min,int max) {
        int ranNum = ThreadLocalRandom.current().nextInt(min,max);
        return ranNum;
    }

    public ArrayList<Player> addPlayer(int numberOfPlayers,PositionEnum position) {
        ArrayList<Player> list1442 = new ArrayList<Player>();
        ArrayList<Player> temp = new ArrayList<Player>();
        do {
            int random= usingRandom(1,24);
            for (Player p : allPlayers) {
                if (p.getNumber()==(random)) {
                    if (p.getPosition().equals(position)) {
                        list1442.add(p);
                    }
                }
            }
            for (Player player : list1442) {
                if (!temp.contains(player)) {
                    temp.add(player);
                }

            }
            list1442.clear();
            list1442.addAll(temp);

        } while (list1442.size()<numberOfPlayers);
        return list1442;
    }
    }



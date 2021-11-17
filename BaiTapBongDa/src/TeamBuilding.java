import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TeamBuilding {
    PlayerRepository repo = new PlayerRepository();
    ArrayList<Player> allPlayers = repo.listPlayers();

    public int usingRandom(int min, int max) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max);
        return randomNumber;
    }

    public ArrayList<Player> addPlayer(int numberOfPlayers, PositionEnum position) {
        ArrayList<Player> listPlayersByPosition = new ArrayList<>();
        do {
            int randomNumber = usingRandom(1, 24);
            for (Player p : allPlayers) {
                if (p.getNumber() == (randomNumber)) {
                    if (p.getPosition().equals(position)&&!listPlayersByPosition.contains(p)) {
                        listPlayersByPosition.add(p);
                    }
                }
            }
        } while (listPlayersByPosition.size() < numberOfPlayers);
        return listPlayersByPosition;
    }
    public ArrayList<Player> setTactical(int gkNumber, int dfNumber, int mfNumber, int fwNumber) {
        ArrayList<Player> selectedPlayers = new ArrayList<>();
        ArrayList<Player> gkList =addPlayer(gkNumber, PositionEnum.GK);
        ArrayList<Player> dfList =addPlayer(dfNumber, PositionEnum.DF);
        ArrayList<Player> mfList =addPlayer(mfNumber, PositionEnum.MF);
        ArrayList<Player> fwList =addPlayer(fwNumber, PositionEnum.FW);
        selectedPlayers.addAll(gkList);
        selectedPlayers.addAll(dfList);
        selectedPlayers.addAll(mfList);
        selectedPlayers.addAll(fwList);
        return selectedPlayers;
    }
}



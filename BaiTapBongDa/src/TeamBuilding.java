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
            int random = usingRandom(1, 24);
            for (Player p : allPlayers) {
                if (p.getNumber() == (random)) {
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
        selectedPlayers.add(gkList.get(gkNumber - 1));
        for (int i = 0; i < dfNumber; i++) {
            selectedPlayers.add(dfList.get(i));
        }
        for (int i = 0; i < mfNumber; i++) {
            selectedPlayers.add(mfList.get(i));
        }
        for (int i = 0; i < fwNumber; i++) {
            selectedPlayers.add(fwList.get(i));
        }
        return selectedPlayers;
    }
}



import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TeamBuilding {
    PlayerRepository repo = new PlayerRepository();
    ArrayList<Player> allPlayers = repo.listPlayers();


    public int useRandom(int min, int max) {
        int general = ThreadLocalRandom.current().nextInt(min, max);
        return general;
    }

    public ArrayList<Player> selectPlayers(int gkSize, int dfSize, int mfSize, int fwSize) {
        ArrayList<Player> selectedTeam = new ArrayList<>();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwardSize = 0;
        while (gateKeeperSize < gkSize) {
            int rdGateKeeper = useRandom(1,23);
            if (allPlayers.get(rdGateKeeper).getPosition().equals(PositionEnum.GK)) {
                selectedTeam.add(allPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }
        while (defenderSize < dfSize) {
            int rdDefender = useRandom(1,23);
            if (allPlayers.get(rdDefender).getPosition().equals(PositionEnum.DF) && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                selectedTeam.add(allPlayers.get(rdDefender));
                defenderSize++;
            }
        }
        while (midFieldSize < mfSize) {
            int rdMidField = useRandom(1,23);
            if (allPlayers.get(rdMidField).getPosition().equals(PositionEnum.MF) && !selectedTeam.contains(allPlayers.get(rdMidField))) {
                selectedTeam.add(allPlayers.get(rdMidField));
                midFieldSize++;
            }
        }
        while (forwardSize < fwSize) {
            int rdForward = useRandom(1,23);
            if (allPlayers.get(rdForward).getPosition().equals(PositionEnum.FW) && !selectedTeam.contains(allPlayers.get(rdForward))) {
                selectedTeam.add(allPlayers.get(rdForward));
                forwardSize++;
            }
        }
        return selectedTeam;
    }
}

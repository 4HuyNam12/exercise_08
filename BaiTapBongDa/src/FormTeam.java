import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FormTeam {
    TeamBuild teambuild = new TeamBuild();
    public ArrayList<Player> setTactical(int gkNumber,int dfNumber,int mfNumber,int fwNumber) {
        TeamBuild listPlayer = new TeamBuild();
        ArrayList<Player> selectedPlayers = new ArrayList<Player>();
        ArrayList<Player> gk = listPlayer.addPlayer(gkNumber,PositionEnum.GK);
        ArrayList<Player> df = listPlayer.addPlayer(dfNumber,PositionEnum.DF);
        ArrayList<Player> mf = listPlayer.addPlayer(mfNumber,PositionEnum.MF);
        ArrayList<Player> fw = listPlayer.addPlayer(fwNumber,PositionEnum.FW);
        selectedPlayers.add(gk.get(gkNumber-1));
        for (int i = 0; i<dfNumber;i++) {
            selectedPlayers.add(df.get(i));
        }
        for (int i = 0; i<mfNumber;i++) {
            selectedPlayers.add(mf.get(i));
        }
        for (int i = 0; i<fwNumber;i++) {
            selectedPlayers.add(fw.get(i));
        }
        return selectedPlayers;
    }




}

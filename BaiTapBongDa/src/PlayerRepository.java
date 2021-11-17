import java.util.ArrayList;

public class PlayerRepository {
    public ArrayList<Player> listPlayers() {
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1, "Bùi Tấn Trường", PositionEnum.GK));
        allPlayers.add(new Player(2, "Đỗ Duy Mạnh", PositionEnum.DF));
        allPlayers.add(new Player(3, "Quế Ngọc Hải", PositionEnum.DF));
        allPlayers.add(new Player(23, "Trần Nguyên Mạnh", PositionEnum.GK));
        allPlayers.add(new Player(12, "Nguyễn Văn Hoàng", PositionEnum.GK));
        allPlayers.add(new Player(13, "Hồ Tấn Tài", PositionEnum.DF));
        allPlayers.add(new Player(16, "Nguyễn Thành Chung", PositionEnum.DF));
        allPlayers.add(new Player(7, "Nguyễn Phong Hồng Duy", PositionEnum.DF));
        allPlayers.add(new Player(17, "Vũ Văn Thanh", PositionEnum.DF));
        allPlayers.add(new Player(5, "Phạm Xuân Mạnh", PositionEnum.DF));
        allPlayers.add(new Player(4, "Bùi Tiến Dũng", PositionEnum.DF));
        allPlayers.add(new Player(21, "Bùi Hoàng Việt Anh", PositionEnum.DF));
        allPlayers.add(new Player(19, "Nguyễn Quang Hải", PositionEnum.MF));
        allPlayers.add(new Player(15, "Phạm Đức Huy", PositionEnum.MF));
        allPlayers.add(new Player(6, "Lương Xuân Trường", PositionEnum.MF));
        allPlayers.add(new Player(20, "Phan Văn Đức", PositionEnum.MF));
        allPlayers.add(new Player(14, "Nguyễn Hoàng Đức", PositionEnum.MF));
        allPlayers.add(new Player(8, "Lê Văn Xuân", PositionEnum.MF));
        allPlayers.add(new Player(11, "Nguyễn Tuấn Anh", PositionEnum.MF));
        allPlayers.add(new Player(9, "Nguyễn Văn Toàn", PositionEnum.FW));
        allPlayers.add(new Player(22, "Nguyễn Tiến Linh", PositionEnum.FW));
        allPlayers.add(new Player(10, "Nguyễn Công Phượng", PositionEnum.FW));
        allPlayers.add(new Player(18, "Hà Đức Chinh", PositionEnum.FW));
        return allPlayers;
    }

    public void printList(ArrayList<Player> players) {
        for (Player p : players) {
            System.out.println(p);
        }
    }
}

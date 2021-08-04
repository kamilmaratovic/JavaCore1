package lesson12_HomeWork_PC;

public class SystemBlock {
    private MotherBoard motherBoard;
    private Disk disk;

    public SystemBlock(MotherBoard motherBoard, Disk disk) {
        this.motherBoard = motherBoard;
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}

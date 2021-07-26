package PC_HomeWork_lesson12;

public class MotherBoard {
    private String model;
    private String brand;
    private Processor processor;
    private VideoCard videoCard;
    private RAM ram;

    public MotherBoard(String model, String brand, Processor processor, VideoCard videoCard, RAM ram) {
        this.model = model;
        this.brand = brand;
        this.processor = processor;
        this.videoCard = videoCard;
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}

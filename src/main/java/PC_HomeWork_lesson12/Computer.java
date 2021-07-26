package PC_HomeWork_lesson12;

public class Computer {
    private Keybord keybord;
    private Mouse mouse;
    private Display display;
    private SystemBlock systemBlock;

    public Computer(Keybord keybord, Mouse mouse, Display display, SystemBlock systemBlock) {
        this.keybord = keybord;
        this.mouse = mouse;
        this.display = display;
        this.systemBlock = systemBlock;
    }

    public Keybord getKeybord() {
        return keybord;
    }

    public void setKeybord(Keybord keybord) {
        this.keybord = keybord;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
}

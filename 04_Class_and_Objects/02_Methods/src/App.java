class Computer {
    // Methods
    public void playMusic() {
        System.out.println("Playing music....");
    }

    public void pauseMusic() {
        System.out.println("Pausing music....");
    }
}

public class App {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic(); // Playing music....
        comp.pauseMusic(); // Pausing music....
    }
}

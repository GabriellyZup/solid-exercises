package exercicio5;

public class Computer {
    private InputDevice inputDevice;

    public Computer(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public void useInputDevice() {
        inputDevice.use();
    }
}

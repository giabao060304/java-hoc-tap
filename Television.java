public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Television is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is turned off.");
    }
}

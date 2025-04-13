package internal;

public class BluetoothSpeaker extends Speaker{
    @Override
    public void playAudio() {
        System.out.println("Bluetooth speaker streaming wirelessly");
    }

    public void connectDevice() {
        System.out.println("Connecting to phone via Bluetooth");
    }
}

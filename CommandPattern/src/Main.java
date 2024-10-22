import command.*;
import receiver.*;
public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();
        remote.setCommand(0, new TurnTVOn(tv));
        remote.setCommand(1, new PlayStereo(stereo));
        remote.setCommand(2, new DimLights(light));
        remote.pressButton(0);
        remote.pressUndo();
        remote.pressButton(1);
        remote.pressUndo();
        remote.pressButton(2);
        remote.pressUndo();
    }
}

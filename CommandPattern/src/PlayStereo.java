package command;
import receiver.Stereo;
public class PlayStereo implements Command {
    private Stereo stereo;
    public PlayStereo(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.play();
    }
    @Override
    public void undo() {
        stereo.stop();
    }
}

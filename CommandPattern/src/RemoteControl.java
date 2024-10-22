import command.*;
public class RemoteControl {
    private Command[] commands = new Command[3];
    private Command undoCommand;
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }
    public void pressButton(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }
    public void pressUndo() {
        undoCommand.undo();
    }
}

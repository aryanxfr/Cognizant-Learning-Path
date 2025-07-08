import command.LightOffCommand;
import command.LightOnCommand;
import invoker.RemoteControl;
import receiver.Light;

public class CommandTest {
    public static void main(String[] args) {
        Light livingRoomLight=new Light("Living Room");
        Light bedRoomLight=new Light("Bed Room");
        LightOnCommand lightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff=new LightOffCommand(bedRoomLight);
        RemoteControl remote=new RemoteControl();
        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();
        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

package commandPattern;

public class CommandDown implements ICommand {
	 dPad controller = null;
	 public CommandDown( dPad controller)
    {
		 this.controller = controller;
    }
	public void execute() {
		// TODO Auto-generated method stub
		controller.moveDown();
	
	}

	public void undo() {
		// TODO Auto-generated method stub
		controller.moveUp();
	}

}
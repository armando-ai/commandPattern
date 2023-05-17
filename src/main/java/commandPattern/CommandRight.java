package commandPattern;

public class CommandRight implements ICommand {
	 dPad controller = null;
	 public CommandRight( dPad controller)
    {
		 this.controller = controller;
    }
	public void undo() {
		// TODO Auto-generated method stub
		controller.moveLeft();
	
	}

	public void execute() {
		// TODO Auto-generated method stub
		controller.moveRight();
	}

}
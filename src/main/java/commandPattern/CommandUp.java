package commandPattern;

public class CommandUp implements ICommand {
	 dPad controller = null;
	 public CommandUp( dPad controller)
    {
		 this.controller = controller;
    }
	public void execute() {
		// TODO Auto-generated method stub
		controller.moveUp();
	
	}

	public void undo() {
		// TODO Auto-generated method stub
		controller.moveDown();
	}

}
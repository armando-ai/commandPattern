package commandPattern;

public class CommandColor implements ICommand {
	dPad controller = null;

	public void execute() {
		// TODO Auto-generated method stub
		controller.changeColor();

	}

	public CommandColor(dPad controller) {
		super();
		this.controller = controller;
	}

	public void undo() {
		// TODO Auto-generated method stub
		controller.undoColor();
	}

}

package commandPattern;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class CommandLeft implements ICommand {
	dPad controller = null;

	public void execute() {
		// TODO Auto-generated method stub
		controller.moveLeft();

	}

	public CommandLeft(dPad controller) {
		super();
		this.controller = controller;
	}

	public void undo() {
		// TODO Auto-generated method stub
		controller.moveRight();
	}

}

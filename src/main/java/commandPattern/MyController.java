package commandPattern;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Window;

public class MyController implements Initializable {
	ArrayList<ICommand> history = new ArrayList<ICommand>();
	ArrayList<String> ColorList = new ArrayList<String>();
		private MyController thisController ;
	    dPad Controller;
		public void  initialize(URL url, ResourceBundle rb) {
		    thisController = this;
		    
		    Controller = new dPad(thisController);
		}
	    @FXML
	    private Pane rootpane;
	    
	    @FXML
	    private Pane redBox;
	    
	    public Pane getRedBox() {
			return redBox;
		}
		
		@FXML
	    private Button btnDown;

	    @FXML
	    private Button btnUp;

	    @FXML
	    private Button btnLeft;

	    @FXML
	    private Button btnRight;

	    @FXML
	    private Pane btnCc;

	    @FXML
	    private Pane btnUndo;
	  
	    
	    @FXML
	    private void moveLeft(ActionEvent event) {
	        event.consume();
	        if(this.redBox.getLayoutX()-this.redBox.getWidth()<0) {
	        	System.out.println("invalid move");
	        }else {
	        ICommand command = new CommandLeft(Controller);
	        command.execute();
	        history.add(command);}
	        //if x or y axis is out then move
	    }
	    @FXML
	    private void moveRight(ActionEvent event) {
	    	event.consume();
	    	if(this.redBox.getLayoutX()+this.redBox.getWidth()>473) {
	        	System.out.println("invalid move");
	        }else {
	        
	        ICommand command = new CommandRight(Controller);
	        command.execute();
	        history.add(command);
	        }
	    }
	    @FXML
	    private void moveUp(ActionEvent event) {
	    	event.consume();
	    	if(this.redBox.getLayoutY()-this.redBox.getHeight()<0) {
	        	System.out.println("invalid move -1");
	        }else {
	        
	        ICommand command = new CommandUp(Controller);
	        command.execute();
	        history.add(command);
	        System.out.println(this.redBox.getLayoutY());
	        }
	    }
	    @FXML
	    private void moveDown(ActionEvent event) {
	    	event.consume();
	    	if(this.redBox.getLayoutY()+this.redBox.getHeight()>269) {
	        	System.out.println("invalid move-2");
	        }else {
	        
	        ICommand command = new CommandDown(Controller);
	        command.execute();
	        history.add(command);
	        }
	    }
	    @FXML
	    public void undo(MouseEvent mouseEvent) {
	    	mouseEvent.getSource();
	    	if(history.size()!=0) {
			history.get(history.size() - 1).undo();
			
			history.remove(history.size() - 1);
	
	    	}else {
	    		System.out.println("NO more undo");
	    	}
		
		}
	    @FXML
	    public void change(MouseEvent mouseEvent) {
	    	mouseEvent.getSource();
	    	ICommand command = new CommandColor(Controller);
	        command.execute();
	        history.add(command);
			
		}
		public ArrayList<String> getColorList() {
			// TODO Auto-generated method stub
			return this.ColorList;
		}
	
		

}

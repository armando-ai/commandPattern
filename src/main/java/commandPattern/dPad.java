package commandPattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.sun.tools.javac.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class dPad{
	
	
	@FXML
	Pane redBox;

	ArrayList<String> ColorList= new ArrayList<String>();
	
	public dPad(MyController myController) {
		
		this.redBox = myController.getRedBox();
		
	}
	

	public void moveUp() {
		 this.redBox.setLayoutY(this.redBox.getLayoutY()-this.redBox.getHeight());
	}

	public void moveDown() {
		 this.redBox.setLayoutY(this.redBox.getLayoutY()+this.redBox.getHeight());
	}

	public void moveLeft() {
		 this.redBox.setLayoutX(this.redBox.getLayoutX()-this.redBox.getWidth());
	}

	public void moveRight() {
		 this.redBox.setLayoutX(this.redBox.getLayoutX()+this.redBox.getWidth());
	}
	
	public void changeColor() {
		Random obj = new Random();
		int rand_num = obj.nextInt(0xffffff + 1);
		// format it as hexadecimal string and print
		String colorCode = String.format("#%06x", rand_num);
		this.redBox.setStyle("-fx-background-color:"+colorCode);
		ColorList.add(colorCode);
		
		
	}


	public void undoColor() {
		// TODO Auto-generated method stub
		System.out.println(ColorList);
		if(ColorList.size()!=1) {
			System.out.println(ColorList.get(ColorList.size()-1));
			this.redBox.setStyle("-fx-background-color:"+ ColorList.get(ColorList.size()-1));
			ColorList.remove(ColorList.size()-1);
			
		}else {
			this.redBox.setStyle("-fx-background-color:#000000" );
			ColorList.remove(ColorList.size()-1);
		}
		System.out.println(ColorList);
		
		
	}

	

}

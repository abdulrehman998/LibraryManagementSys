import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public interface StdNtcBoard {
	public default void StudentNoticeBoard() {
	Stage primaryStage = new Stage();
	primaryStage.setTitle("Library Management System");
	GridPane root = new GridPane();
	root.setHgap(5);
	root.setVgap(5);
	root.setPadding(new Insets(10, 10, 10, 10));
      Text txt = new Text("Notice Board");
      txt.setFont(Font.font(20));
      root.add(txt, 1, 0);
      Scene scene = new Scene(root, 480, 250);
      root.setStyle("-fx-background-color: #fffacd;");
      final TextArea txtarea = new TextArea();
      txtarea.setEditable(false);
      txtarea.setPrefSize(400, 180);
      root.add(txtarea, 1, 3);
      Button bt1 = new Button();
      bt1.setText("Go Back");
      root.add(bt1, 1, 6);
      bt1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			primaryStage.close();
		}
      });
      String fileName = "temp.txt";
      String line = null;
      String message = new String();
      try {
          FileReader fileReader = 
              new FileReader(fileName);
          BufferedReader bufferedReader = 
              new BufferedReader(fileReader);
          while((line = bufferedReader.readLine()) !=null) {
        	  message += line +"\n";
        	  
        	 txtarea.setText(message);
          }   
          bufferedReader.close();    
      }
      catch(FileNotFoundException ex) {
          System.out.println(
              "Unable to open file '" + 
              fileName + "'");                
      }
      catch(IOException ex) {
          System.out.println(
              "Error reading file '" 
              + fileName + "'");                  
          // Or we could just do this: 
          // ex.printStackTrace();
      }
      primaryStage.setScene(scene);
      primaryStage.show();
}
}


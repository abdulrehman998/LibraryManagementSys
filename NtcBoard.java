import java.io.BufferedWriter;
import java.io.FileWriter;
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

public interface NtcBoard {
	public default void NoticeBoard() {
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
      root.setStyle("-fx-background-color: BURLYWOOD");
      final TextArea txtarea = new TextArea();
      txtarea.setEditable(true);
      txtarea.setPrefSize(400, 180);
      root.add(txtarea, 1, 3); 
      Button bt1 = new Button();
      bt1.setText("Save");
      bt1.setMinSize(50, 30);
      root.add(bt1, 3, 9);
      String fileName = "temp.txt";
      Button bt2 = new Button();
      bt2.setText("Go Back");
      root.add(bt2, 1, 9);
      bt2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			primaryStage.close();	
		}
      });
      bt1.setOnAction(new EventHandler <ActionEvent>() {
    	  @Override
		    public void handle(ActionEvent e){
    	        String fileName = "temp.txt";
    	        try {
    	      FileWriter fileWriter =
    	                new FileWriter(fileName);
    	            BufferedWriter bufferedWriter =
    	                new BufferedWriter(fileWriter);
    	            bufferedWriter.write(txtarea.getText());
    	            bufferedWriter.close();
    	        }
    	        catch(IOException ex) {
    	            System.out.println(
    	                "Error writing to file '"
    	                + fileName + "'");
    	        }
    	       primaryStage.close();
    	    }
    	  });
      primaryStage.setScene(scene);
      primaryStage.show();
}
}



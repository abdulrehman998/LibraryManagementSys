import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public interface ViewIssuedBooks {
public default void ViewIssuedBks() {
	Stage primaryStage = new Stage();
	primaryStage.setTitle("Library Management System");
	GridPane root = new GridPane();
	root.setHgap(5);
	root.setVgap(5);
	root.setPadding(new Insets(10,10,10,10));
	root.setStyle("-fx-background-color: beige;");
	Scene scene = new Scene(root,300,300);
	Button bt1 = new Button("Go Back");
	bt1.setStyle("-fx-background-color: darkslateblue;");
	bt1.setTextFill(Color.WHITE);
	root.add(bt1, 1, 9);
	Text txt = new Text("Books Issued by Students");
	txt.setFont(Font.font(java.awt.Font.DIALOG, 23));
	root.add(txt, 1, 0);
	final TextArea txtarea = new TextArea();
    txtarea.setEditable(false);
    txtarea.setPrefSize(200, 200);
    root.add(txtarea, 1, 3);
    String fileName = "temp2.txt";
    String message = new String();
    String line = null;
    try { 
    FileReader fileReader = new FileReader(fileName);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    while((line = bufferedReader.readLine()) != null) {
    	message += line +"\n";
    	txtarea.setText(message);
    }
    bufferedReader.close();
    }
    catch(IOException ex) {
    	System.out.println("Error Reading File " + fileName );
    }
    bt1.setOnAction(e -> {
    	primaryStage.close();
    });
	primaryStage.setScene(scene);
	primaryStage.show();
}
}

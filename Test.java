 import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test extends Application implements StdLogin,AdmLogin,TeachLogin{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		Stage primaryStage = new Stage();
		GridPane root = new GridPane();
		root.setStyle("-fx-background-image: url(l3.jpg);" 
				+"-fx-background-repeat: no-repeat;"
				+ "-fx-background-size: 100% 100%;");
		root.setHgap(20);
		root.setVgap(20);
		root.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Library Management System");
		Text txt = new Text("Welcome To Library Management System");
		txt.setFill(Color.BURLYWOOD);
		txt.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC, 28));
		txt.setUnderline(true);
	     // txt.setFont(Font.font(java.awt.Font.DIALOG, 18));
	    final javafx.scene.effect.Effect glow = new Glow(0.3);
	    txt.setEffect(glow);
		root.add(txt, 0, 0, 2, 1);
		Button bt1 = new Button();
		bt1.setText("Student Login");
		bt1.setFont(Font.font(16));
		root.add(bt1, 1, 1);
		Button bt2 = new Button();
		bt2.setText("Admin Login");
		bt2.setFont(Font.font(16));
		
		root.add(bt2, 1, 2);
		Button bt3 = new Button();
		bt3.setText("Teacher Login");
		root.add(bt3, 1, 3);
		bt3.setFont(Font.font(16));
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			    public void handle(ActionEvent e){
				 StudentLogin();
				 
			 }
		});
		
		bt2.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			    public void handle(ActionEvent e){
				 AdminLogin();
				 
			 }
		});
		
		bt3.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			    public void handle(ActionEvent e){
				 TeacherLogin();
				 
			 }
		});
			primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public interface AdmLogin extends AdmView{
	public default void AdminLogin() {
		Stage primaryStage = new Stage();
		GridPane root = new GridPane();
		root.setStyle("-fx-background-image: url(22.jpg);" 
				+"-fx-background-repeat: no-repeat;"
				+ "-fx-background-size: 100% 100%;");
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(root);
		final Label lb1 = new Label("");
		primaryStage.setTitle("Library Management System");
		Text txt3 = new Text("ADMIN LOGIN");
		txt3.setFill(Color.NAVAJOWHITE);
		txt3.setUnderline(true);
		txt3.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC, 28));
        //txt3.setFont(Font.font(23));
		root.add(txt3, 0,0,2,2);
		Text txt1 = new Text("Username ");
		txt1.setFill(Color.WHITE);
		txt1.setFont(Font.font("Lucida Console", FontWeight.EXTRA_BOLD,16));
		root.add(txt1, 0,0,9,9);
		TextField tf1= new TextField();
		root.add(tf1, 8, 6);
		tf1.setPromptText("Username");
		Text txt2 = new Text("Password ");
		txt2.setFill(Color.WHITE);
		txt2.setFont(Font.font("Lucida Console", FontWeight.EXTRA_BOLD,16));

		root.add(txt2, 0,0,17,17);
		PasswordField tf2= new PasswordField();
		root.add(tf2, 8, 8);
		tf2.setPromptText("Password");
		Button bt4 = new Button();
		bt4.setText("Login");
		bt4.setFont(Font.font(14));
		bt4.setPrefWidth(80);
		root.add(bt4, 12, 11);
		bt4.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			    public void handle(ActionEvent e){
				 if (tf1.getText().equals("admin") && (tf2.getText().equals("a123"))) {
					
				 
				 AdminView();
			 }
				 else {
						lb1.setText("Incorrect Username or Password");
						lb1.setStyle("-fx-text-fill: Red;");
					}
				 tf1.clear();
				 tf2.clear();
			
		}});
		 Button bt17 = new Button();
	      bt17.setText("Go Back");
	      bt17.setFont(Font.font(14));
			bt17.setPrefWidth(80);
	      root.add(bt17, 11, 11);
	      bt17.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
	      });
		root.add(lb1, 8, 7);
	
		primaryStage.setScene(scene);
		primaryStage.show();

}}
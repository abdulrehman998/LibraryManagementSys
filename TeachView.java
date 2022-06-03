import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public interface TeachView extends NtcBoard,BkList,Issuebook{
	public default void TeacherView() {
		Stage primaryStage = new Stage();
		GridPane root = new GridPane();
		root.setStyle("-fx-background-image: url(33.jpg);" 
				+"-fx-background-repeat: no-repeat;"
				+ "-fx-background-size: 100% 100%;");
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(root,500,300);
		primaryStage.setTitle("Library Management System");
		Button btn1 = new Button();
		btn1.setText("View Available Books");
		btn1.setFont(Font.font(15));
		root.add(btn1, 3, 1);
		Button btn2 = new Button();
		btn2.setText("Issue Book");
		btn2.setFont(Font.font(15));
		root.add(btn2, 7, 10);
		Button btn3 = new Button();
		btn3.setText("Notice Board");
		btn3.setFont(Font.font(15));
		root.add(btn3, 4, 5);
		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				NoticeBoard();
				
			}
			
		});
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				BookList();
				
			}
			
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				IssueBk();
				
			}
	});
		primaryStage.setScene(scene);
		primaryStage.show();
}}


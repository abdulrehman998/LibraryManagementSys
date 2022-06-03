import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  interface BkList {
	public default void BookList() {
		Stage primaryStage = new Stage();
		 GridPane root = new GridPane();
		root.setStyle("-fx-background-color: gray;");
		root.setHgap(5);
		root.setVgap(5);
		root.setPadding(new Insets(10, 10, 10, 10));
		 Scene scene = new Scene(root,680,500);
		 Button bt1 = new Button();
		 bt1.setText("Go Back");
		 root.add(bt1, 4, 25);
		 bt1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.close();
				
			}
			 
		 });
		 Text txt = new Text("Available Books In Library");
		 root.add(txt, 4, 1);
		 txt.setFont(Font.font(20));
		 Text txt1 = new Text("Mathematics Books");
		 root.add(txt1, 1, 10);
		 txt1.setFont(Font.font(20));
		 Text txt2 = new Text("Programming Books");
		 root.add(txt2,4,10);
		 txt2.setFont(Font.font(20));
		 Text txt3 = new Text("Science Books");
		 root.add(txt3, 7, 10);
		 txt3.setFont(Font.font(20));
		 Text txt4 = new Text("Note: Books must be returned in 20 days");
		 root.add(txt4, 1, 25);
		 ObservableList<String> data = FXCollections.observableArrayList();
		    ListView<String> listView = new ListView<String>(data);
		    listView.setPrefSize(150, 300);
		    root.add(listView, 1, 15);
		    data.add("Introduction to Probability Models, Tenth Edition");
		    data.add("Basic Mathematics");
		    data.add("A History of π");
		    data.add("Letters to a Young Mathematician");
		    data.add("Mathematics: A Very Short Introduction");
		    data.add("The Math Olympian");
		    data.add("Math and Magic in Wonderland");
		    listView.setItems(data);
		    ObservableList<String> data2 = FXCollections.observableArrayList();
		    ListView<String> listView2 = new ListView<String>(data2);
		    listView2.setPrefSize(100, 300);
		    root.add(listView2, 4, 15);
		    data2.add("Code Complete");
		    data2.add("Introduction to Algorithms");
		    data2.add("The C++ Programming Language");
		    data2.add("JavaScript: The Definitive Guide");
		    data2.add("Single Page Web Applications");
		    data2.add("Programming Perl");
		    data2.add("Async JavaScript");
		    ObservableList<String> data3 = FXCollections.observableArrayList();
		    ListView<String> listView3 = new ListView<String>(data3);
		    listView3.setPrefSize(200, 300);
		    root.add(listView3, 7, 15);
		    data3.add("The Universe in a Nutshell");
		    data3.add("Chaos: Making a New Science");
		    data3.add("Thinking, Fast and Slow");
		    data3.add("The Structure of Scientific Revolutions");
		    data3.add("The World Without Us");
		    data3.add("How the Mind Works");
		    data3.add("Why Evolution Is True");
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }
		}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public interface Issuebook {
@SuppressWarnings({ "rawtypes", "unchecked" })
public default void IssueBk() {
	Stage primaryStage = new Stage();
	GridPane root = new GridPane();
	primaryStage.setTitle("Library Management System");
	root.setStyle("-fx-background-color: beige;");
	root.setHgap(5);
	root.setVgap(5);
	root.setPadding(new Insets(10,10,10,10));
	Scene scene = new Scene(root,680,500);
	Button bt1 = new Button("Select Book");
	bt1.setStyle("-fx-background-color: darkslateblue");
    bt1.setTextFill(Color.WHITE);
	root.add(bt1, 7, 25);
	ComboBox cb = new ComboBox();
	cb.setPromptText("Select From");
	cb.getItems().add("Mathematics");
	cb.getItems().add("Programming");
	cb.getItems().add("Science");
	cb.setStyle("-fx-background-color: gold ");
	root.add(cb, 4, 25);
	Text txt = new Text("Available Books In Library");
	txt.setFont(Font.font(java.awt.Font.DIALOG, 20));
	 root.add(txt, 4, 1);
	 Text txt1 = new Text("Mathematics Books");
	 txt1.setFont(Font.font(java.awt.Font.DIALOG, 20));
	 root.add(txt1, 1, 10);
	 Text txt2 = new Text("Programming Books");
	 txt2.setFont(Font.font(java.awt.Font.DIALOG, 20));
	 root.add(txt2,4,10);
	 Text txt3 = new Text("Science Books");
	 txt3.setFont(Font.font(java.awt.Font.DIALOG, 20));
	 root.add(txt3, 7, 10);
	 Text txt4 = new Text("Note: Books must be returned in 20 days");
	 root.add(txt4, 1, 25);
	 ObservableList<String> data = FXCollections.observableArrayList();
	 ListView<String> listView = new ListView<String>(data);
	 listView.setPrefSize(150, 300);
	 root.add(listView,1,15);
	 data.add("Introduction to Probability Models, Tenth Edition");
	    data.add("Basic Mathematics");
	    data.add("A History of π");
	    data.add("Letters to a Young Mathematician");
	    data.add("Mathematics: A Very Short Introduction");
	    data.add("The Math Olympian");
	    data.add("Math and Magic in Wonderland");
	    listView.setStyle("-fx-border-color: darkslateblue; -fx-border-width: 2px;");
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
	    listView2.setStyle("-fx-border-color: darkslateblue; -fx-border-width: 2px;");
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
	    Label lbl = new Label("");
	    listView3.setStyle("-fx-border-color: darkslateblue; -fx-border-width: 2px;");
	    root.add(lbl, 7, 23);
	    listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	    listView2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	    listView3.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	    bt1.setOnAction(e -> {
	    	ObservableList<String> message ;
		    String fileName = "temp2.txt";
		    lbl.setText("Book Issued Successfully");
		    lbl.setStyle("-fx-text-fill:Green;");
	        try {
	            FileWriter fileWriter =
	                new FileWriter(fileName,true);

	            BufferedWriter bufferedWriter =
	                new BufferedWriter(fileWriter);
	            
	          if(cb.getValue().equals("Mathematics")) {
	        	  
	            message = listView.getSelectionModel().getSelectedItems();
	           bufferedWriter.write(message.toString());
	           bufferedWriter.newLine();
	          }
	          if(cb.getValue().equals("Programming")) {
	        	  message = listView2.getSelectionModel().getSelectedItems();
		          bufferedWriter.write(message.toString());
		           bufferedWriter.newLine();
	          }
	          else if(cb.getValue().equals("Science")) {
	        	  message = listView3.getSelectionModel().getSelectedItems();
		           bufferedWriter.write(message.toString());
		          bufferedWriter.newLine();
	          
	          }
	            bufferedWriter.close();
                 }
	        
	        catch(IOException ex) {
	            System.out.println(
	                "Error writing to file '"
	                + fileName + "'");
	            
	        }
	       
		    });
	    Button bt12 = new Button();
	      bt12.setText("Go Back");
	      root.add(bt12, 1, 6);
	      bt12.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
	      });

	    primaryStage.setScene(scene);
	    primaryStage.show();
}
}

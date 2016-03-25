package Interface;



import javafx.application.Application;
import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 //import javafx.geometry.HPos;
 import javafx.geometry.Insets;
// import javafx.beans.binding.Bindings;
public class Calculater_feature  extends Application{
@Override
public void start(Stage primary){
	VBox pane=new VBox();
	pane.setSpacing(5);
	
	//creat textfield 
	    TextField screen = new TextField();
	    screen.setStyle("-fx-background-color: aquamarine;");
	    screen.setAlignment(Pos.CENTER_RIGHT);
	    screen.setEditable(false);
	    pane.getChildren().add(screen);
	 // Create a pane and set its properties
		 HBox Row1 = new HBox();
		 Row1.setSpacing(5);
		 Button bt_neg=new Button("( - )");
		 Row1.getChildren().add(bt_neg);
		 Button bt_abs=new Button(" Abs  ");
		 Row1.getChildren().add(bt_abs);
		 Button bt_sin=new Button(" Sin ");
		 Row1.getChildren().add(bt_sin);
		 Button bt_cos=new Button(" Cos ");
		 Row1.getChildren().add(bt_cos);
		 Button bt_tan=new Button(" Tan ");
		 Row1.getChildren().add(bt_tan);
		 Button bt_fac=new Button("  !   ");
		 Row1.getChildren().add(bt_fac);
		 pane.getChildren().add( Row1);
		 /////
		 HBox Row2 = new HBox();
		 Row2.setSpacing(5);
		 Button bt7=new Button("  7  ");
		 Row2.getChildren().add(bt7);
		 Button bt8=new Button("  8  ");
		 Row2.getChildren().add(bt8);
		 Button bt9=new Button("  9  ");
		 Row2.getChildren().add(bt9);
		 Button bt_Divid=new Button("  /  ");
		 Row2.getChildren().add(bt_Divid);
		 Button btDele=new Button(" Del  ");
		 Row2.getChildren().add(btDele);
		 Button btAc=new Button("   AC   ");
		 Row2.getChildren().add(btAc);
		 pane.getChildren().add( Row2);
		 ////////////////
		 HBox Row3 = new HBox();
		 Row3.setSpacing(5);
		 Button bt4=new Button("  4  ");
		 Row3.getChildren().add(bt4);
		 Button bt5=new Button("  5  ");
		 Row3.getChildren().add(bt5);
		 Button bt6=new Button("  6  ");
		 Row3.getChildren().add(bt6);
		 Button bt_multi=new Button("  X  ");
		 Row3.getChildren().add(bt_multi);
		 Button bt_Arch_OP=new Button("    (    ");
		 Row3.getChildren().add(bt_Arch_OP);
		 Button  bt_Arch_end=new Button("    )    ");
		 Row3.getChildren().add(bt_Arch_end);
		 pane.getChildren().add( Row3);
		 ////////////
		 HBox Row4 = new HBox();
		 Row4.setSpacing(5);
		 Button bt1=new Button("  1  ");
		 Row4.getChildren().add(bt1);
		 Button bt2=new Button("  2  ");
		 Row4.getChildren().add(bt2);
		 Button bt3=new Button("  3  ");
		 Row4.getChildren().add(bt3);
		 Button bt_Sub=new Button("  -   ");
		 Row4.getChildren().add(bt_Sub);
		 Button bt_pow=new Button(" pow ");
		 Row4.getChildren().add(bt_pow);
		 Button  bt_Sqrt=new Button("  Sqrt ");
		 Row4.getChildren().add(bt_Sqrt);
		 pane.getChildren().add( Row4);
		 ///////////////
		 HBox Row5 = new HBox();
		 Row5.setSpacing(5);
		 Button bt0=new Button("  0  ");
		 Row5.getChildren().add(bt0);
		 Button bt_point=new Button("  .   ");
		 Row5.getChildren().add(bt_point);
		 Button bt_perc=new Button("  %  ");
		 Row5.getChildren().add(bt_perc );
		 Button bt_sum=new Button("  + ");
		 Row5.getChildren().add(bt_sum);
		 Button bt_pi=new Button("   PI ");
		 Row5.getChildren().add(bt_pi);
		 Button bt_Result=new Button("     =    ");
		 Row5.getChildren().add(bt_Result);
		
		 pane.getChildren().add(Row5);
		 Scene scene = new Scene(pane);
		 primary.setTitle("Calculater"); // Set the stage title
		 primary.setScene(scene); // Place the scene in the stage
		 primary.show(); 
		 
		 
	    
}
	public static void main(String[] args) {
		Application.launch(args);

	}

}
